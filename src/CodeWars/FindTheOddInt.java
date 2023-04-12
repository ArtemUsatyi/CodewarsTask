package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheOddInt {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};
        List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());

        int number = numbers
                .stream()
                .filter(n -> numbers
                        .stream()
                        .filter(x -> x == n)
                        .count() % 2 != 0)
                .findAny().orElse(null);
        System.out.println(number);
    }
}
