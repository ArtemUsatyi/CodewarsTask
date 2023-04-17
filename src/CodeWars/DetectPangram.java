package CodeWars;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectPangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        Pattern letters = Pattern.compile("[a-z]");
        Matcher matcher = letters.matcher(str.toLowerCase());
        HashSet<String> hashSet = new HashSet<>();
        while (matcher.find()) hashSet.add(matcher.group());
        if (hashSet.size() == 26) System.out.println("Используется весь алфавит");
        else System.out.println("Неиспользуется весь алфавит");

//        Алтернативный вариант
//        sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
