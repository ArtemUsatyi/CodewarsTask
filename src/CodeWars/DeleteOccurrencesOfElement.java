package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteOccurrencesOfElement {
    public static void main(String[] args) {
        int[] array = {20, 37, 20, 21};
        int maxRepeat = 1;
        //List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();

        for (int elem : array) {
            int count = (int) newList.stream().filter(i -> i == elem).count();
            if (count < maxRepeat) newList.add(elem);
        }
        int[] newArray = newList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(newArray));

    }
}
