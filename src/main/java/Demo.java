import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Demo {

    public List<String> upperCase(List<String> input) {
        List<String> output = new ArrayList<>();
        for (String s : input) {
            output.add(s.toUpperCase());
        }
        return output;
    }
}
