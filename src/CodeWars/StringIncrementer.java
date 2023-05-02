package CodeWars;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIncrementer {
    public static void main(String[] args) {
        String text = "a123456789";
        Pattern p = Pattern.compile("([a-zA-Z\\W]+)(\\d+)");
        Matcher m = p.matcher(text);
        ArrayList<String> arraysList = new ArrayList<>();
        while (m.find()) {
            arraysList.add(m.group(1));
            arraysList.add(m.group(2));
        }

        if (arraysList.isEmpty()) System.out.println(text + 1);
        else {
            String count = String.valueOf(Integer.parseInt(arraysList.get(1)) + 1);
            for (int i = 0; i < count.length(); i++) {
                if (arraysList.get(1).length() > count.length()) count = "0" + count;
                else break;
            }
            arraysList.set(1, String.valueOf(count));
            System.out.println(arraysList.get(0) + arraysList.get(1));
        }
    }
}
