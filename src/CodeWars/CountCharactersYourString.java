package CodeWars;

import java.util.*;

public class CountCharactersYourString {
    public static void main(String[] args) {
        String text = "aabbaab";
        List<Character> listChar = List.of(text.chars().mapToObj(c -> (char) c).toArray(Character[]::new));
        Map<Character, Integer> mapCharInt = new TreeMap<>();

        for (Character character : listChar) {
            if (mapCharInt.containsKey(character)) continue;
            mapCharInt.put(character, (int) listChar.stream().filter(e -> e.equals(character)).count());
        }
        System.out.println(mapCharInt);
    }
}
