package Instance;

import java.util.List;

public interface Instance {
    public void addSelector(Selector selector);
    public void addSelectors(List<Selector> selectors);
    public void addAttribute(Attribute attribute);
    public void addAttributes(List<Attribute> attributes);
    public List<Selector> getSelectors();
    public List<Attribute> getAttributes();
}
