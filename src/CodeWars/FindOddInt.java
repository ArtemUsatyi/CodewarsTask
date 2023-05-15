package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddInt {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 2, 2, 1};
        List<Integer> listNumber = Arrays.stream(array).boxed().collect(Collectors.toList());
        for (int element : listNumber) {
            int count = (int) listNumber.stream().filter(i -> i == element).count();
            if (count % 2 != 0) {
                System.out.println(element);
                break;
            }
        }

    }
}
