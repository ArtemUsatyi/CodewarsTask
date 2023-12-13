package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingTeamArithmeticProgress {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, 11}; // 0, 1, 2, 3, 4
        // int [] array = {4, 3, 1};

        List<Integer> list = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());

        int index = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int variable = list.get(i) - list.get(i + 1);
            if (index == variable) break;
            else index = Math.abs(variable);
        }
        System.out.println(index);
    }
}
