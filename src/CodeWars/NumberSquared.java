package CodeWars;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class NumberSquared {
    public static void main(String[] args) {
        int number = 812;
        LinkedList<Integer> listNum = new LinkedList<>();
        if (number == 0) listNum.add(number);
        else while (number > 0) {
            listNum.addFirst(number % 10);
            number = number / 10;
        }
        int newNum = Integer.parseInt(listNum.stream().map(i -> i * i).map(Object::toString).collect(Collectors.joining("")));
        System.out.println(newNum);
    }
}
