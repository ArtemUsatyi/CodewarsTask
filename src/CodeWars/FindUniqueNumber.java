package CodeWars;

import java.util.Arrays;

public class FindUniqueNumber {
    public static void main(String[] args) {
        double[] array = {1, 1, 1, 1, 2, 1};
        Arrays.sort(array);
        if (array[0] == array[1]) System.out.println(array[array.length - 1]);
        else System.out.println(array[0]);
    }
}

