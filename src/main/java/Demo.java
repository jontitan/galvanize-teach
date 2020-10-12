import java.util.*;

public class Demo {

    public List<String> upperCase(List<String> input) {
        List<String> output = new ArrayList<>();
        for (String s : input) {
            output.add(s.toUpperCase());
        }
        return output;
    }

    public List<Integer> filterByOddNumber(List<Integer> input) {
        List<Integer> output = new ArrayList<>();
        for (Integer integer : input) {
            if (integer % 2 == 1) {
                output.add(integer);
            }
        }
        return output;
    }

    public Set<String> findByValue(Map<String, String> input,
                                   String value) {
        Set<String> output = new HashSet<>();
        for (Map.Entry<String, String> entry : input.entrySet()) {
            if (entry.getValue().equals(value)) {
                output.add(entry.getKey());
            }
        }
        return output;
    }
}
