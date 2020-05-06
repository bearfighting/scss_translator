package cssGenerator;

import scss.generator.analysis.DepthFirstAdapter;
import scss.generator.node.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class CodeGenerator extends DepthFirstAdapter {
    private String result;
    private String parent;
    private PrintStream output;
    private Scope currentScope = new Scope();

    private Map<String, List<String>> ruleset = new LinkedHashMap<>();

    public void generate(
            String outputFilename,
            Node tree)
            throws IOException {

        FileOutputStream file = new FileOutputStream(outputFilename);
        this.output = new PrintStream(file);
        visit(tree);
        ruleset.forEach((k, v) -> {output.println(k + "{");
            v.forEach(e -> output.println("  " + e.trim()));
            output.println("}");});
        this.output.close();
        file.close();
    }

    private void visit(
            Node node) {
        if (node != null) {
            node.apply(this);
        }
    }

    @Override
    public void caseARuleRuleset(ARuleRuleset node) {
        this.result = node.getIdentifier().getText();

        if (currentScope.getPerentScope() != null) {
            this.result = currentScope.getPerentScope().getSelector() + " " + result;
        }
        currentScope.setSelector(this.result);

        visit(node.getBlock());
    }

    @Override
    public void caseAPropertyRuleset(APropertyRuleset node) {
        String first = node.getFirst().getText();
        String second = "";
        for (int i = 0; i < node.getSecond().size(); i++) {
            second += " " + node.getSecond().get(i).getText();
        }
        String attribute = " " + first + ":" + second + ";";
        String selector = currentScope.getPerentScope().getSelector();
        if (ruleset.containsKey(selector)) {
            List<String> s = ruleset.get(selector);
            s.add(attribute);
            ruleset.put(selector, s);
        } else {
            List<String> s = new ArrayList<>();
            s.add(attribute);
            ruleset.put(selector, s);
        }
    }

    @Override
    public void inABlock(ABlock node) {
        currentScope = new Scope(currentScope);
    }

    @Override
    public void outABlock(ABlock node) {
        currentScope = currentScope.getPerentScope();
    }
}
