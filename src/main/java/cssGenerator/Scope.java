package cssGenerator;

public class Scope {
    private Scope perentScope;
    private String selector;

    public Scope() {
        this.selector = "";
        this.perentScope = null;
    }

    public Scope(Scope perentScope) {
        this.perentScope = perentScope;
    }

    public void setSelector(String parentSelector) {
        this.selector = parentSelector;
    }

    public String getSelector() {
        return selector;
    }

    public Scope getPerentScope() {
        return this.perentScope;
    }
}
