package Output;

import Instance.InstanceCSS;

public class toExpandedStyle implements toStyle {
    InstanceCSS instanceCSS;

    public toExpandedStyle(InstanceCSS instanceCSS) {
        this.instanceCSS = instanceCSS;
    }

    @Override
    public String toOutput() {
        String res = "";
        String spaces = "     ";
        for (int i = 0; i < instanceCSS.getSelectors().size(); i++) {
            res += instanceCSS.getSelectors().get(i).toString() + " ";
        }

        res += "{\n";
        for (int i = 0; i < instanceCSS.getAttributes().size(); i++) {
            res += spaces + instanceCSS.getAttributes().get(i).toString() + ";\n";
        }

        res += "}\n";
        return res;
    }
}
