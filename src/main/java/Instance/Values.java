package Instance;

import java.util.ArrayList;
import java.util.List;

public class Values {
    List<String> values;

    public Values() {
        values = new ArrayList<>();
    }

    public void addValue(String value) {
        values.add(value);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < values.size(); i++) {
            res += values.get(i) + " ";
        }

        return res;
    }
}
