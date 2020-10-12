import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class DemoTest {

    Demo subject = new Demo();

    @Test
    void upperCase() {
        List<String> input = List.of("ABC", "abc", "ABc", "aBC");

        List<String> output = subject.upperCase(input);

        assertThat(output).containsOnly("ABC");
    }

    @Test
    void filter() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> output = subject.filterByOddNumber(input);

        assertThat(output).containsOnly(1, 3, 5, 7);
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
}
