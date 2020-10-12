import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DemoTest {

    Demo subject = new Demo();

    @Test
    void upperCase() {
        List<String> input = List.of("ABC", "abc", "ABc", "aBC");

        List<String> output = subject.upperCase(input);

        assertThat(output).containsOnly("ABC");
    }
}
