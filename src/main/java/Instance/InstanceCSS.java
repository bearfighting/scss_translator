package Instance;

import java.util.*;

public class InstanceCSS implements Instance{
    private List<Selector>selectors;
    private List<Attribute>attributes;

    public InstanceCSS() {
        this.selectors = new ArrayList<>();
        this.attributes = new ArrayList<>();
    }

    @Override
    public void addSelector(Selector selector) {
        selectors.add(selector);
    }

    @Override
    public void addSelectors(List<Selector> selectors) {selectors.addAll(selectors);}

    @Override
    public void addAttribute(Attribute attribute) {
        attributes.add(attribute);
    }

    @Override
    public void addAttributes(List<Attribute> attributes) {
        this.attributes.addAll(attributes);
    }

    @Override
    public List<Selector> getSelectors() {
        return selectors;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }
}
