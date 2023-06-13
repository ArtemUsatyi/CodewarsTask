package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.add(7);
        items.add(8);
        items.add(9);
        items.add(10);
        List<Object> itemsNew = new ArrayList<>();
        int k = 2;

        int index = 0;
        while (items.size() > 0) {
            index = (index + k - 1) % items.size();
            itemsNew.add(items.get(index));
            items.remove(index);
        }
        System.out.println(itemsNew);

    }
}
