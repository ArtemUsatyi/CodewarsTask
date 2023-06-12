package CodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteDuplicatesList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }
}
