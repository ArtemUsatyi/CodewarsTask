package CodeWars;

import java.util.Arrays;

public class FindSumOfTwoValue {
    public static void main(String[] args) {
        int[] array = {1234,5678,9012};
        int target = 14690;

        int[] indexArray = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (target == (array[i] + array[j])) {
                    indexArray[0] = i;
                    indexArray[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(indexArray));
    }
}
