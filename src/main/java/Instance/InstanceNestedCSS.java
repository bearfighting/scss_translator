package Instance;

import java.util.ArrayList;
import java.util.List;

public class InstanceNestedCSS implements Instance{
    private List<Selector>selectors;
    private List<Attribute>attributes;
    List<Instance> instances;

    public InstanceNestedCSS() {
        this.selectors = new ArrayList<Selector>();
        this.attributes = new ArrayList<Attribute>();
        this.instances = new ArrayList<Instance>();
    }

    public void addInstances(Instance instance) {
        instances.add(instance);
    }

    public List<Instance> getInstances() {
        return instances;
    }

    @Override
    public void addSelector(Selector selector) {
        this.selectors.add(selector);
    }

    @Override
    public void addSelectors(List<Selector> selectors) {
        this.selectors.addAll(selectors);
    }

    @Override
    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
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
