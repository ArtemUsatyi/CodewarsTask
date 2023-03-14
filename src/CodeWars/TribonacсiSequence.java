package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TribonacсiSequence {
    public static void main(String[] args) {
        int[] arrayTribonacci = {3, 14, 15};
        int amountNumberArray = 10;
        List<Integer> listTribonacci = Arrays.stream(arrayTribonacci).boxed().collect(Collectors.toList());

        int counter = amountNumberArray - arrayTribonacci.length;

        for (int i = 0; i < counter; i++) {
            listTribonacci.add(listTribonacci.get(i) + listTribonacci.get(i + 1) + listTribonacci.get(i + 2));
        }
        double[] arr = listTribonacci.stream().mapToDouble(d -> d).toArray();

        System.out.println(listTribonacci);
    }
}
