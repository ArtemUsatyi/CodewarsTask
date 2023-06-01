package CodeWars;

import java.util.Arrays;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 1};
        int k = (int) Arrays.stream(array).distinct().count();
        System.out.println(k);

    }
}
