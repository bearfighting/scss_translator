package cssCalculator.values;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall {
    private String name;
    private List<String> args;

    public FunctionCall() {
        this.name = "";
        this.args = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getArgs() {
        return args;
    }

    public void addArg(String arg) {
        this.args.add(arg);
    }

    @Override
    public String toString() {
        String res = "";
        if (this.name == "") {
            return res = "";
        } else {
            if (args.size() > 0) {
                res += this.name + "(" + args.get(0);
                for (int i = 1; i < this.args.size(); i++) {
                    res += ", " + this.args.get(i);
                }
                res += ")";
            } else {
                res += this.name + "()";
            }
            return res;
        }

    }
}
