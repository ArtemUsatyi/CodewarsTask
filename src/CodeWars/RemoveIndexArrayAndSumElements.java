package CodeWars;

import java.util.Arrays;

public class RemoveIndexArrayAndSumElements {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        int index = 2;
        int k = 0;
        //int k = (int) Arrays.stream(array).filter(elem -> elem != index).count();
        for (int elem : array) {
            if (elem != index) k++;
        }
        System.out.println(k);
    }
}
