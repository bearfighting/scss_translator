package cssCalculator;

import cssCalculator.structure.Attribute;
import cssCalculator.structure.Mixin;
import cssCalculator.structure.BlockType;
import scss.calculation.analysis.DepthFirstAdapter;
import scss.calculation.node.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Calculator extends DepthFirstAdapter {
    private String result;
    private PrintStream output;
    private Scope currentScope = new Scope();

    public void calculate(
            String outputFilename,
            Node tree)
            throws IOException {

        FileOutputStream file = new FileOutputStream(outputFilename);
        this.output = new PrintStream(file);
        visit(tree);
        this.output.close();
        file.close();
    }

    private void visit(
            Node node) {
        if (node != null) {
            node.apply(this);
        }
    }

    public String findValue(Scope currentScope, String k) {
        String s = "";
        if (currentScope.getParentScope() != null) {
            if (currentScope.getParentScope().getVariables().containsKey(k)) {
                s = currentScope.getParentScope().getVariables().get(k);
            } else {
                s = findValue(currentScope.getParentScope(), k);
            }
        }
        return s;
    }

    @Override
    public void caseARulesetStatement(ARulesetStatement node) {
        currentScope.setStatementType(BlockType.Ruleset);
        this.visit(node.getFirst());
        output.print(this.result);
        this.visit(node.getBlock());
    }

    @Override
    public void caseAMixinStatement(AMixinStatement node) {
        currentScope.setStatementType(BlockType.Mixin);
        this.result = node.getIdentifier().getText();
        currentScope.getMixin().setName(this.result);
        visit(node.getFirst());
        currentScope.getMixin().addParams(this.result);
        for (int i = 0; i < node.getSecond().size(); i++) {
            visit(node.getSecond().get(i));
            currentScope.getMixin().addParams(this.result);
        }
        this.visit(node.getBlock());
    }

    @Override
    public void caseAIncludeStatement(AIncludeStatement node) {
        this.visit(node.getFirst());
        List<String> args = new ArrayList<>();
        if (this.currentScope.getFunctionCall().toString() == "") {
            args.add(this.result);
        } else {
            args.add(this.currentScope.getFunctionCall().toString());
        }
        for (int i = 0; i < node.getRest().size(); i++) {
            if (this.currentScope.getFunctionCall().toString() == "") {
                args.add(this.result);
            } else {
                args.add(this.currentScope.getFunctionCall().toString());
            }
        }
        List<String> params = currentScope.getParentScope().getMixin().getParams();
        List<Attribute> attributes = currentScope.getParentScope().getMixin().getAttributes();
        if (args.size() == params.size()) {
            for (int i = 0; i < params.size(); i++) {
                for (Attribute attribute : attributes) {
                    output.print(attribute.getName() + ": ");
                    for (int j = 0; j < attribute.getProperties().size(); j++) {
                        String s = attribute.getProperties().get(j);
                        if (s.equals(params.get(i))) {
                            output.print(args.get(i));
                        } else {
                            output.print(s);
                        }
                    }
                    output.println(";");
                }
            }
        } else {
            throw new RuntimeException("The parameters and arguments are not the same number");
        }
    }

    @Override
    public void caseACallFunctionCall(ACallFunctionCall node) {
        this.visit(node.getName());
        currentScope.getFunctionCall().setName(this.result);
        this.visit(node.getFirst());
        currentScope.getFunctionCall().addArg(this.result);
        for (int i = 0; i < node.getSecond().size(); i++) {
            this.visit(node.getSecond().get(i));
            currentScope.getFunctionCall().addArg(this.result);
        }
    }

    @Override
    public void caseAAssigmentStatement(AAssigmentStatement node) {
        this.visit(node.getFirst());
        String first = this.result;
        this.visit(node.getSecond());
        String second = this.result;
        String s1 = "";
        String s2 = "";
        List<String> s = new ArrayList<>();
        s.add(second);
        for (int i = 0; i < node.getRest().size(); i++) {
            this.visit(node.getRest().get(i));
            s1 = s1 + ", " + this.result;
            s2 = s2 + " " + this.result;
            s.add(this.result);
        }
        if (first.charAt(0) == '$') {
            s1 = second + ", " + s1;
            this.currentScope.addVariable(first, s1);
        } else if (currentScope.getParentScope().getStatementType() == BlockType.Mixin) {
            currentScope.getParentScope().getMixin().addAttribute(first, s);
        } else {
            this.result = first + ": " + second.trim() + " " + s2.trim() + ";";
            this.result = this.result.replaceAll(",", "");
            output.println(this.result);
        }
    }

    @Override
    public void caseADollarVariable(ADollarVariable node) {
        this.visit(node.getVariable());
        this.result = "$" + this.result;
        if (currentScope.getVariables().containsKey(result)) {
            this.result = currentScope.getVariables().get(result);
        } else {
            String s = findValue(currentScope, result);
            if (s != "") {
                this.result = s;
            }
        }
    }

    @Override
    public void caseADotVariable(ADotVariable node) {
        this.visit(node.getVariable());
        this.result = "." + this.result;
    }

    @Override
    public void caseAPercUnit(APercUnit node) {
        this.visit(node.getUnit());
        this.result = this.result + "%";
    }

    @Override
    public void caseAStringValue(AStringValue node) {
        this.result = node.getIdentifier().getText();
    }

    @Override
    public void caseAColorTerm(AColorTerm node) {
        this.result = node.getColor().getText();
    }

    @Override
    public void caseANumberTerm(ANumberTerm node) {
        this.result = node.getIntegerLiteral().getText();
    }

    @Override
    public void inAStatementBlock(AStatementBlock node) {
        this.currentScope = new Scope(this.currentScope);
        if (currentScope.getParentScope().getStatementType() == BlockType.Ruleset) {
            output.println("{");
        }
    }

    @Override
    public void outAStatementBlock(AStatementBlock node) {
        this.currentScope = this.currentScope.getParentScope();
        if (currentScope.getStatementType() == BlockType.Ruleset) {
            output.println("}");
        }
    }

    @Override
    public void caseACommaCommaValue(ACommaCommaValue node) {
        this.visit(node.getCommaValue());
    }
}
