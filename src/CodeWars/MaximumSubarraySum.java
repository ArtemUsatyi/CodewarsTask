package CodeWars;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.reverseOrder;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // { -2 1 -3 4 -1 2 -5}
        List<Integer> list = Arrays.stream(array).boxed().distinct().sorted(reverseOrder()).collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < array.length / 2; i++) {
            count += list.get(i);
        }
        System.out.println(count);
    }
}
