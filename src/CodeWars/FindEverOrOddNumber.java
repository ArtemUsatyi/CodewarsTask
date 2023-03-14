package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEverOrOddNumber {
    public static void main(String[] args) {
        int[] everNumbers = {Integer.MAX_VALUE, 0, 1}; // 11 при 1
        int[] oddNumbers = {160, 3, 1719, 19, 11, 13, -21}; // 160 при 0

        System.out.println(findNumber(everNumbers));
    }

    private static int findNumber(int[] arrayNumbers) {

        List<Integer> list = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());
        Map<Boolean, List<Integer>> partitions = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evens = partitions.get(true);
        List<Integer> odds = partitions.get(false);

        if(evens.size()>odds.size()) return odds.get(0);
        else return evens.get(0);
    }
}
