package CodeWars;

import java.util.Arrays;
import java.util.Objects;

public class SumValueInArray {

    public static void main(String[] args) {
        Boolean[] arrayFalseOrTrue = {true, false, null, true, false, true};

        long count = Arrays.stream(arrayFalseOrTrue)
                .filter(Objects::nonNull)
                .filter(elem -> elem.equals(true))
                .count();
        System.out.println(count);
    }
}
