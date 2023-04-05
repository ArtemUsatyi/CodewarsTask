package CodeWars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        int number = 145720;

        List<Integer> listNumber = Arrays.stream(String.valueOf(number).split("")).map(Integer::valueOf)
                .collect(Collectors.toList());
        listNumber.sort(Collections.reverseOrder());
        System.out.println(Integer.parseInt(listNumber.stream().map(Object::toString)
                .collect(Collectors.joining(""))));

    }

}
