package CodeWars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllCamelCase {
    public static void main(String[] args) {
        String text = " d а      ввававава";

        String listText = Stream.of(text.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .map(t -> t.substring(0, 1).toUpperCase().concat(t.substring(1))).collect(Collectors.joining());

        System.out.println(listText);
    }
}
