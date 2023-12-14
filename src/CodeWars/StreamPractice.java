package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("john", "bob", "tom");

        String name = listString.stream()
                .sorted()
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase())
                .collect(Collectors.joining());

        System.out.println(name);

//        ЗАДАЧА
//        capitalize("abcdef") = ['AbCdEf', 'aBcDeF'] - пример задачи
//        Сперва вернуть слово с заглаными буквами Четные индексы, потом Нечетные индексы. 0 индекс считать четным числом.

        String s = "abcdef";
        String[] arrayText = s.split("");
        String[] arrayCapitalLetters = new String[2];

        for (int i = 0; i < 2; i++) {
            String textCase = "";
            for (int j = 0; j < arrayText.length; j++) {
                if ((j + i) % 2 == 0) textCase += arrayText[j].toUpperCase();
                else textCase += arrayText[j].toLowerCase();
            }
            arrayCapitalLetters[i] = textCase;
        }
        System.out.println(Arrays.toString(arrayCapitalLetters));

//        Алтернативное решение через STREAM API
        String first = IntStream.range(0, s.length())
                .map(i -> i % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : s.charAt(i))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());

        String second = IntStream.range(0, s.length())
                .map(i -> i % 2 != 0 ? Character.toUpperCase(s.charAt(i)) : s.charAt(i))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());

        System.out.println(first);
        System.out.println(second);
    }
}
