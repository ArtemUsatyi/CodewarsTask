package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TheySame {
    public static void main(String[] args) {
        int[] arrayA = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] arrayB = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        List<Integer> listA = Arrays.stream(arrayA).boxed().collect(Collectors.toList());

        boolean bool = true;
        for (int elem : arrayB) {
            for (int i = 0; i < listA.size(); i++) {
                int countPow = listA.get(i) * listA.get(i);
                if (elem == countPow) {
                    listA.remove(i);
                    bool = true;
                    break;
                } else bool = false;
            }
            if (!bool) break;
        }
        System.out.println(bool);
    }
}
