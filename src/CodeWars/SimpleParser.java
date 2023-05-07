package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleParser {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        String text = "iiisdoso";
        int count = 0;
        for (String elem : text.split("")) {
            if (elem.equals("i")) count++;
            else if (elem.equals("s")) count = (int) Math.pow(count, 2);
            else if (elem.equals("d")) count--;
            else if (elem.equals("o")) listNumber.add(count);
        }
        int[] array = listNumber.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(listNumber);

    }
}
