package CodeWars;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.reverseOrder;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // { -2 1 -3 4 -1 2 -5}
        Set<Integer> setList = Arrays.stream(array).boxed().collect(Collectors.toSet());
        List<Integer> list = new ArrayList<>();
        for (int elem : setList) {
            list.add(elem);
        }
        list.sort(reverseOrder());
        int count = 0;
        for (int i = 0; i < array.length / 2; i++) {
            count += list.get(i);
        }
        System.out.println(count);
    }
}
