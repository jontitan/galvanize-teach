import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapLesson {

    public static void main(String[] args) {
        intro();
//        map();
//        map_practice();
//        filterAndMap();
//        filterAndMap_practice();
    }

    static void intro() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("print from for loop (Imperative): ");
        for (int value : numbers) {
            System.out.print(value);
        }

        System.out.print("\nprint from stream (Declarative): ");
        Arrays
            .stream(numbers)
            .forEach(number -> System.out.print(number));
    }

    static void map() {
        String[] words = {"ABC", "abc", "ABc", "aBC"};
        List<String> loopResult = new ArrayList<>();
        for (String s : words) {
            loopResult.add(s.toUpperCase());
        }

        System.out.println("Traditional loop: " + loopResult);


        List<String> mapResult = Arrays
            .stream(words)
            .map(word -> word.toUpperCase())
            .collect(Collectors.toList());

        System.out.println("Steam map: " + mapResult);
    }

    static void map_practice() {
        Integer[] numbers = {1, 2, 3, 4};
        // return a List that contains each elements from numbers array incremented by 1

        List<Integer> result = new ArrayList<>();


        // Test below, DO NOT modify
        List<Integer> expected = Arrays.asList(2, 3, 4, 5);
        if (expected.equals(result)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("Result: " + result);
        }
    }

    static void filterAndMap() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<String> loopResult = new ArrayList<>();
        for (Integer integer : numbers) {
            if (integer % 2 == 1) {
                loopResult.add(integer.toString());
            }
        }

        System.out.println("Traditional loop: " + loopResult);


        List<String> streamResult = numbers
            .stream()
            .filter(number -> number % 2 == 1)
            .map(number -> number.toString())
            .collect(Collectors.toList());

        System.out.println("Stream filter map: " + streamResult);
    }

    static void filterAndMap_practice() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // return a List of BigInteger that is greater than 5

        List<BigInteger> result = new ArrayList<>();


        // Test below, DO NOT modify
        List<BigInteger> expected = Arrays.asList(
            new BigInteger("6"),
            new BigInteger("7"),
            new BigInteger("8")
        );
        if (expected.equals(result)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("Result: " + result);
        }
    }
}
