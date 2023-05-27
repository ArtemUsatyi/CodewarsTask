package CodeWars;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int[] arrayNew = new int[2];
        int target = 6;

        boolean flag = false;
        for (int elem : array) {
            if (flag) break;
            for (int i = 1; i < array.length; i++) {
                if (elem + array[i] == target) {
                    arrayNew[0] = elem;
                    arrayNew[1] = array[i];
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}
