package Output;

import Instance.InstanceCSS;

public class toCompressedStyle implements toStyle {
    InstanceCSS instanceCSS;

    public toCompressedStyle(InstanceCSS instanceCSS) {
        this.instanceCSS = instanceCSS;
    }

    @Override
    public String toOutput() {
        String res = "";
        for (int i = 0; i < instanceCSS.getSelectors().size(); i++) {
            res += instanceCSS.getSelectors().get(i);
        }

        res += "{";
        for (int i = 0; i < instanceCSS.getAttributes().size(); i++) {
            res += instanceCSS.getAttributes().get(i) + ";\n";
        }

        res += "}";
        return res;
    }
}
