package Instance;

import java.util.ArrayList;
import java.util.List;

public class ExpansionCSS {
    InstanceNestedCSS instanceNestedCSS;

    public ExpansionCSS(InstanceNestedCSS instanceNestedCSS) {
        this.instanceNestedCSS = instanceNestedCSS;
    }

    public List<InstanceCSS> expandInstance() {
        List<InstanceCSS> instanceCSSs = new ArrayList<InstanceCSS>();
        expandInstanceNestedCSS(instanceCSSs, this.instanceNestedCSS);
        return instanceCSSs;
    }

    private void expandInstanceNestedCSS(List<InstanceCSS> instanceCSSs, Instance instance) {
        InstanceCSS instanceCSS = new InstanceCSS();
        instanceCSS.addSelectors(instance.getSelectors());
        instanceCSS.addAttributes(instance.getAttributes());
        instanceCSSs.add(instanceCSS);
        if (instance instanceof InstanceNestedCSS) {
            for(int i = 0; i < ((InstanceNestedCSS)instance).getInstances().size(); i++) {
                expandInstanceNestedCSS(instanceCSSs, ((InstanceNestedCSS)instance).getInstances().get(i));
            }
        }
    }
}
