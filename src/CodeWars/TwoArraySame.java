package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class TwoArraySame {
    public static void main(String[] args) {
        int[] array = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] arrayTwo = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
        ArrayList<Integer> listTwo = (ArrayList<Integer>) Arrays.stream(arrayTwo).boxed().collect(Collectors.toList());
        Iterator<Integer> listIterator = listTwo.iterator();

        while (listIterator.hasNext()) {
            Integer element = listIterator.next();
            for (Integer index : list) {
                if (element == (int) Math.pow(index, 2)) {
                    listIterator.remove();
                    break;
                }
            }
        }
        if(listTwo.isEmpty()) System.out.println("Одинаковые");
        else System.out.println("не одинаковые");

    }
}
