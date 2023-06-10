package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        ArrayList<Integer> listArray = (ArrayList<Integer>) Arrays.stream(digits).boxed().collect(Collectors.toList());
        for (int i = listArray.size() - 1; i >= 0; i--) {
            listArray.set(i, listArray.get(i) + 1);
            if (listArray.get(i) == 10) {
                listArray.set(i, 0);
                if (i == 0) listArray.add(0, 1);
            } else break;
        }
        int[] arr = listArray.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
