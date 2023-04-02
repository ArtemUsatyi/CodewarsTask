package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        int[] A = {1, 1, 3, 4, 5, 6};
        int[] B = {1, 2};
        ArrayList<Integer> listArray = (ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList());

        for (int j : B) {
            for (int i = 0; i < listArray.size(); i++) {
                if (listArray.get(i) == j) {
                    listArray.remove(i);
                    i--;
                }
            }
        }
        int[] arr = listArray.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));

//        Альтернативный способ вычитания одного массива из другого:
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
    }
}
