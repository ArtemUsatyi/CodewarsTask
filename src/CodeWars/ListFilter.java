package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilter {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, "aasf", "aasf", "aasf", "aasf", "d", "13", -123));
        list.removeIf(o -> o instanceof String);
        System.out.println(list);
    }
}
