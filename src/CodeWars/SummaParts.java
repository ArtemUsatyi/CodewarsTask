package CodeWars;

import java.util.Arrays;

public class SummaParts {
    public static void main(String[] args) {
        int[] array = {0, 1, 3, 6, 10};
        int[] newArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            int summa = 0;
            for (int j = i; j < array.length; j++) {
                summa += array[j];
            }
            newArray[i] = summa;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
