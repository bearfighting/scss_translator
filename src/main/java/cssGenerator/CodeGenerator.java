package cssGenerator;

import scss.analysis.DepthFirstAdapter;
import scss.node.*;

public class CodeGenerator extends DepthFirstAdapter {
    private String result;

    public static void generate(Node tree) {
        CodeGenerator codeGenerator = new CodeGenerator();
        tree.apply(codeGenerator);
    }

    @Override
    public void caseASelectors(ASelectors node) {
        node.getFirst().apply(this);
        String selectors = this.result;
        for (int i = 0; i < node.getRest().size(); i++) {
            node.getRest().get(i).apply(this);
            selectors = selectors + " " + this.result.trim();
        }

        for (int i = 0; i < node.getAttrib().size(); i++) {
            node.getAttrib().get(i).apply(this);
            selectors = selectors + " " + this.result.trim();
        }

        this.result = selectors;
    }

    @Override
    public void caseAGtPrefixElement(AGtPrefixElement node) {
        node.getSecond().apply(this);
        this.result = ">" + result;
    }

    @Override
    public void caseAPlusPrefixElement(APlusPrefixElement node) {
        node.getElement().apply(this);
        this.result = "+" + result;
    }

    @Override
    public void caseATilPrefixElement(ATilPrefixElement node) {
        node.getElement().apply(this);
        this.result = "~" + result;
    }

    @Override
    public void caseACommaPrefixElement(ACommaPrefixElement node) {
        node.getPrefixElement().apply(this);
        this.result = "," + result;
    }

    @Override
    public void caseASimplePrefixElement(ASimplePrefixElement node) {
        node.getElement().apply(this);
    }

    @Override
    public void caseAHashElement(AHashElement node) {
        String hash = node.getHash().getText();
        this.result = hash + this.result.trim();
    }

    @Override
    public void caseADotElement(ADotElement node) {
        String dot = node.getDot().getText();
        this.result = dot + this.result.trim();
    }

    @Override
    public void caseASimpleElement(ASimpleElement node) {
        node.getSimpleElement().apply(this);
    }

    @Override
    public void caseAIdentSimpleElement(AIdentSimpleElement node) {
        node.getIdent().apply(this);
    }

    @Override
    public void caseAAndSimpleElement(AAndSimpleElement node) {
        this.result = node.getAnd().getText();
    }

    @Override
    public void caseAStarSimpleElement(AStarSimpleElement node) {
        this.result = node.getStar().getText();
    }

    @Override
    public void caseAEqAttrib(AEqAttrib node) {
        String ident = node.getIdentifier().getText();
        String s = node.getStringLiteral().getText();
        this.result = "[" + ident + "=" + "]";
    }

    @Override
    public void caseAPipeEqAttrib(APipeEqAttrib node) {
        String ident = node.getIdentifier().getText();
        String s = node.getStringLiteral().getText();
        this.result = "[" + ident + "|=" + "]";
    }

    @Override
    public void caseATildEqAttrib(ATildEqAttrib node) {
        String ident = node.getIdentifier().getText();
        String s = node.getStringLiteral().getText();
        this.result = "[" + ident + "~=" + "]";
    }

    @Override
    public void caseASimpleIdent(ASimpleIdent node) {
        this.result = node.getIdentifier().getText();
    }

    @Override
    public void caseAInterpolationIdent(AInterpolationIdent node) {
        String ident = node.getIdentifier().getText();
        this.result = "#{" + "$" + ident.trim() + "}";
    }

    @Override
    public void caseABlock(ABlock node) {

    }

    @Override
    public void caseAPropertyContentInBlock(APropertyContentInBlock node) {
        node.getProperty().apply(this);
    }

    @Override
    public void caseAProperty(AProperty node) {
        node.getIdent().apply(this);
        String ident = this.result;
        node.getValues().apply(this);
        String values = this.result;
        this.result = ident + ":" + values + ";";
    }

    @Override
    public void caseAValues(AValues node) {
        node.getFirst().apply(this);
        String values = this.result;

        for (int i = 0; i < node.getRest().size(); i++) {
            node.getRest().get(i).apply(this);
            values = values + " " + this.result;
        }

        this.result = values;
    }
}
