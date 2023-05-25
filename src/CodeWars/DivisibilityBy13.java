package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibilityBy13 {
    public static void main(String[] args) {
        long n = 1234567;

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            list.add((long) Math.pow(10, i) % 13);
        }
        long count = 0;
        while (true) {
            long[] array = Arrays.stream(String.valueOf(n).split("")).mapToLong(Long::valueOf).toArray();
            long amount = 0;
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                amount += array[i] * list.get(j);
            }
            if (count == amount) {
                break;
            } else {
                n = amount;
                count = amount;
            }
        }
        System.out.println(count);
    }
}
