import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        stream.forEach(System.out::print);
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
            new Student("Mary", 30),
            new Student("Jack", 27),
            new Student("Lawrence", 33)
        );

        List<String> output = subject.mapObject(students);

        assertThat(output).isEqualTo(List.of("Mary", "Jack", "Lawrence"));
    }

    @Test
    void mapObject_check() {

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
    void finalTest() {

    }
}
