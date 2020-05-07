package cssCalculator.structure;

import java.util.List;

public class Attribute {
    private String name;
    private List<String> properties;

    public Attribute(String name, List<String> properties) {
        this.name = name;
        this.properties = properties;
    }

    public Attribute() {
        this.name = "";
        this.properties = null;
    }

    public String getName() {
        return name;
    }

    public List<String> getProperties() {
        return this.properties;
    }

    public void setAttribute(String name, List<String>properties) {
        this.name = name;
        this.properties = properties;
    }
}
