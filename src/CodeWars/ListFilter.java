package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilter {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, "aasf", "1", "123", -123));
        List<Object> newList = list;
        newList.removeIf(o -> o instanceof String);
        newList.removeIf(o -> (int) o < 0);
        System.out.println(newList);
    }
}
