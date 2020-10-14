import java.math.BigInteger;
import java.util.*;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
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

    public List<String> getNames(List<Student> students) {
        List<String> output = new ArrayList<>();
        for (Student student : students) {
            output.add(student.getName());
        }
        return output;
    }

    public String upperCase(Optional<String> input) {
        if (input.isPresent()) {
            return input.get().toUpperCase();
        } else {
            return null;
        }
    }

    public List<Integer> addOne(List<Integer> input) {
        return null;
    }

    public List<BigInteger> filterByGreaterThan(List<Integer> input, int number) {
        return null;
    }

    public List<StudentDto> getAdultStudentDtos(List<Student> students) {
        return null;
    }

    public List<Integer> combine_Multiply_sort(Optional<List<List<Integer>>> input, int multiplyBy) {
        return null;
    }
}
