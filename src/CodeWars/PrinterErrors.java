package CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrinterErrors {
    public static void main(String[] args) {
        String str = "aaaxbbbbyyhwawiwjjjwwm";
        Pattern pattern = Pattern.compile("[n-z]");
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) count++;
        System.out.println(count + "/" + str.length());

        // Алтернативный вариант
        // s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
