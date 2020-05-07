package cssCalculator.structure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mixin {
    private String name;
    private List<String> params;
    private List<Attribute> attributes;

    public Mixin() {
        name = "";
        params = new ArrayList<>();
        attributes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParams() {
        return params;
    }

    public void addParams(String param) {
        this.params.add(param);
    }

    public void addAttribute(String name, List<String> property) {
        Attribute attribute = new Attribute(name, property);
        this.attributes.add(attribute);
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }
}
