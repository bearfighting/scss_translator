package cssCalculator;

import cssCalculator.values.FunctionCall;
import cssCalculator.structure.Mixin;
import cssCalculator.structure.BlockType;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private Scope parentScope;
    private Map<String, String> variables;
    private BlockType statementType;
    private Mixin mixin;
    private FunctionCall functionCall;

    public BlockType getStatementType() {
        return statementType;
    }

    public void setStatementType(BlockType statementType) {
        this.statementType = statementType;
    }

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        this.variables = new LinkedHashMap<>();
        this.mixin = new Mixin();
        this.functionCall = new FunctionCall();
    }

    public Scope() {
        this.parentScope = null;
        this.variables = new LinkedHashMap<>();
        this.mixin = new Mixin();
        this.functionCall = new FunctionCall();
    }

    public void setParentScope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public Scope getParentScope() {
        return this.parentScope;
    }

    public void addVariable(String variable, String values) {
        this.variables.put(variable, values);
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public Mixin getMixin() {
        return mixin;
    }

    public void setMixin(Mixin mixin) {
        this.mixin = mixin;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
}
