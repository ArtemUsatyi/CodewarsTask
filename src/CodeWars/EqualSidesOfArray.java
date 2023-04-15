package CodeWars;

public class EqualSidesOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1};

        int count = -1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - i - 1]) {
                if (count < 0) count = 0;
                count++;
            }
        }
        System.out.println(count);
    }
}
