package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class ArrayThreeAndFive {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 1, 3, 5, 6, 7, 8, 5};
        List<Integer> listArray = new ArrayList<>();

        for (int element : array) {
            if (element == 3 || element == 5) {
                listArray.add(element);
            }
        }
        //return listArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
