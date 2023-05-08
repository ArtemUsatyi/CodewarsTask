package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeNumberAndSumItsDigitsRaisedToTheConsecutivePowers {
    public static void main(String[] args) {
        List<Long> listNumber = new ArrayList<>();
        long a = 1;
        long b = 1000;

        for (long i = a; i <= b; i++) {
            List<Long> number = Arrays.stream(String.valueOf(i).split("")).map(Long::valueOf).collect(Collectors.toList());
            long count = 0;
            for (int j = 0; j < number.size(); j++) {
                count += (long) Math.pow(number.get(j), j + 1);
            }
            if (count == i) listNumber.add(count);
        }
        System.out.println(listNumber);
    }
}














