package CodeWars;

import java.util.stream.Stream;

public class CountIPAddresses {
    public static void main(String[] args) {
        String end = "255.255.255.255";
        long[] endArray = Stream.of(end.split("\\.")).mapToLong(Long::parseLong).toArray();

        String start = "00.0.0.00";
        long[] startArray = Stream.of(start.split("\\.")).mapToLong(Long::parseLong).toArray();

        long numberAddress = 0;
        for (int i = 0; i < 4; i++) {
            numberAddress += endArray[i] - startArray[i] << (8 * (3 - i));
        }
        System.out.println(numberAddress);
    }
}
