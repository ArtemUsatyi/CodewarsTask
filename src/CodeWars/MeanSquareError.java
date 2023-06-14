package CodeWars;

public class MeanSquareError {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 10, 2};
        int[] array2 = {10, 25, 5, -2};
        double count = 0;
        for (int i = 0; i < array1.length; i++) {
            count += Math.pow(array1[i] - array2[i], 2);
            System.out.println(count);
        }
        System.out.println(count/array1.length);
    }
}
