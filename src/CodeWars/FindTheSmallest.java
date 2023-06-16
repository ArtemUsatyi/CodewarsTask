package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheSmallest {
    public static void main(String[] args) {
        int number = 1292;
        List<Integer> list = new ArrayList<>();
        while (number > 0) {
            list.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(list);

        int count = list.get(1);
        for (int i = 1; i < list.size() - 1; i++) {
            if (count > list.get(i + 1)) count = list.get(i + 1);
        }

        for (Integer elem : list) {
            if (elem == count) {
                list.remove(list.lastIndexOf(elem));
            } else continue;
            break;
        }

        for (Integer elem : list) {
            if (count < elem) {
                list.add(list.indexOf(elem), count);
                break;
            }
        }
        int rezult = list.stream().reduce(0, (a, b) -> 10 * a + b);
        System.out.println(rezult);
    }
}
