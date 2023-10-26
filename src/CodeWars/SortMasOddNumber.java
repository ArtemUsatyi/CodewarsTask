package CodeWars;

import java.util.Arrays;

public class SortMasOddNumber {
    public static void main(String[] args) {
        int[] mas = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) continue;
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] % 2 == 0) continue;
                if (mas[i] < mas[j]) {
                    int elem = mas[i];
                    mas[i] = mas[j];
                    mas[j] = elem;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
}
