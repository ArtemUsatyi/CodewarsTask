package CodeWars;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateOfSortArray {
    public static void main(String[] args) {
        int[] array = {2,3,1};
        Set<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toSet());
        System.out.println(list.size());
    }
}
