package CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetcodeFindFirstIndexOfString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "gg";

        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);
        int index = -1;
        while (matcher.find()) {
            if (matcher.start() >= 0) {
                index = matcher.start();
                break;
            }
        }
        System.out.println(index);
    }
}

