package Instance;

public class Attribute {
    String name;
    Values values;

    public Attribute(String name, Values values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public Values getValues() {
        return values;
    }

    @Override
    public String toString() {
        String res = "";
        res += name + " " + values.toString() + ";\n";

        return res;
    }
}
