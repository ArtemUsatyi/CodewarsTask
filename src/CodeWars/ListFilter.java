package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListFilter {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, "aasf", "aasf", "aasf", "aasf", "d", "13", -123));
        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() instanceof String) iterator.remove();
        }
        System.out.println(list);
    }
}
