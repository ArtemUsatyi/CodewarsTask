package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEveryoneThree {

    public static void main(String[] args) {

        int step = 1;
        int element = 0;

        Integer[] arraySoldate = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 1-2, 2-4, 4-6, 6-8
        String[] text = Arrays.toString(arraySoldate).split("[\\[\\]]")[1].split(", ");
        ArrayList<String> list = new ArrayList<>(List.of(text));
        ArrayList<String> list2 = new ArrayList<>();

        while (list.size() > 1) {

            if (list.size() < element) {
                element = 0;
                step = 1;
            }
            if (element == step) {
                list2.add(list.get(element));
                list.remove(element);
                element++;
                step++;
            } else element++;

            System.out.println(list);
            System.out.println(list2);
        }

    }
}
