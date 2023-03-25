package CodeWars;

import java.util.Arrays;

public class MultiplicationTableTwoArray {
    public static void main(String[] args) {
        int n = 4;
        int[][] arrayTable = new int[n][n];
        for (int i = 0, line = 1; i < n; i++, line++) {
            for (int j = 0, column = 1; j < n; j++, column++) arrayTable[i][j] = line * column;
        }
        for (int[] ints : arrayTable) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
