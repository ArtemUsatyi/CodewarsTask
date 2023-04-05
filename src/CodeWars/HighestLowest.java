package CodeWars;

import java.util.Arrays;

public class HighestLowest {
    public static void main(String[] args) {
        String numbers = "1 2 -3 4 5 6";
        int[] array = Arrays.stream(numbers.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(String.valueOf(Arrays.stream(array).max().getAsInt()) + " " +
                String.valueOf(Arrays.stream(array).min().getAsInt()));
    }
}
