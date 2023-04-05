package CodeWars;

import static java.util.Arrays.stream;

public class BitCounting {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(Integer.toBinaryString(number));
        int count = (int) stream(Integer.toBinaryString(number).split("")).filter(i -> i.equals("1")).count();
        System.out.println(count);

        // Алтернативный вариант
        // 1. Integer.bitCount(number);
        // 2. return (int) Integer.toBinaryString(number).chars().filter(c -> c == '1').count();
    }
}
