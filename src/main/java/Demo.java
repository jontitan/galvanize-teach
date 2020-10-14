import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public List<String> upperCase(List<String> input) {
        List<String> output = new ArrayList<>();
        for (String s : input) {
            output.add(s.toUpperCase());
        }
        return output;
    }

    public List<String> filterByOddNumber(List<Integer> input) {
        List<String> output = new ArrayList<>();
        for (Integer integer : input) {
            if (integer % 2 == 1) {
                output.add(integer.toString());
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

    public List<String> mapObject(List<Student> students) {
        List<String> output = new ArrayList<>();
        for (Student student : students) {
            output.add(student.getName());
        }
        return output;
    }

    public List<Integer> addOne(List<Integer> input) {
        return null;
    }

    public List<BigInteger> filterByGreaterThan(List<Integer> input, int number) {
        return null;
    }
}
