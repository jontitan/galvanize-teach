import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DemoTest {

    Demo subject = new Demo();

    @Test
    void print() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : array) {
            System.out.print(i);
        }

        System.out.println();

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(integer -> System.out.print(integer));
    }

    @Test
    void map() {
        List<String> input = List.of("ABC", "abc", "ABc", "aBC");

        List<String> output = subject.upperCase(input);

        assertThat(output).isEqualTo(List.of("ABC", "ABC", "ABC", "ABC"));
    }

    @Test
    void map_check() {
        List<Integer> input = List.of(1, 2, 3, 4);

        List<Integer> output = subject.addOne(input);

        assertThat(output).isEqualTo(List.of(2, 3, 4, 5));
    }

    @Test
    void filterAndMap() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<String> output = subject.filterByOddNumber(input);

        assertThat(output).isEqualTo(List.of("1", "3", "5", "7"));
    }

    @Test
    void filterAndMap_check() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<BigInteger> output = subject.filterByGreaterThan(input, 5);

        assertThat(output).isEqualTo(
            List.of(
                new BigInteger("6"),
                new BigInteger("7"),
                new BigInteger("8")
            )
        );
    }

    @Test
    void mapObject() {
        List<Student> students = Arrays.asList(
            new Student("Mary", 18),
            new Student("Jack", 27),
            new Student("Lawrence", 15)
        );

        List<String> output = subject.getNames(students);

        assertThat(output).isEqualTo(List.of("Mary", "Jack", "Lawrence"));
    }

    @Test
    void mapObject_check() {
        List<Student> students = Arrays.asList(
            new Student("Mary", 18),
            new Student("Jack", 27),
            new Student("Lawrence", 15)
        );

        List<StudentDto> output = subject.getAdultStudentDtos(students);

        assertThat(output).isEqualTo(
            Arrays.asList(
                new StudentDto("Mary", true),
                new StudentDto("Jack", true)
            )
        );
    }

    @Test
    void findByKey() {
        Map<String, String> input =
            Map.ofEntries(
                Map.entry("civic", "honda"),
                Map.entry("fit", "honda"),
                Map.entry("cx-3", "mazda"),
                Map.entry("cx-5", "mazda")
            );

        Set<String> output = subject.findByValue(input, "honda");

        assertThat(output).containsExactlyInAnyOrder("civic", "fit");
    }

    @Test
    void optionalMap() {
        assertThat(subject.upperCase(Optional.of("data")))
            .isEqualTo("DATA");

        assertThat(subject.upperCase(Optional.empty()))
            .isEqualTo(null);
    }

    @Test
    void extraCredit() {
        Optional<List<List<Integer>>> input = Optional.of(
            List.of(
                List.of(4, 5, 6),
                List.of(1, 2, 3),
                List.of(7, 8, 9)
            )
        );

        List<Integer> output = subject.combine_Multiply_sort(input, 10);

        assertThat(output).isEqualTo(
            List.of(10, 20, 30, 40, 50, 60, 70, 80, 90)
        );
    }
}
