package CodeWars;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 9, 16, 25};

        int[] reverseArray = new int[a.length];

        for (int i = 0; i< reverseArray.length; i++) {
            reverseArray[i] = a[a.length-1-i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
