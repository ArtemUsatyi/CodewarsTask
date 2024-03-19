package CodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FireFury {
    public static void main(String[] args) {
        String words = "FURYYYFIREYYFIRE";

        List<String> listWords = new ArrayList<>();

        Matcher matcher = Pattern.compile("FURY|FIRE").matcher(words);
        while (matcher.find()) {
            listWords.add(matcher.group());
        }

        if (listWords.isEmpty()) System.out.println("Fake tweet.");

        StringBuilder result = new StringBuilder();
        String bufferRes = "";

        int fureInt = 0;
        int fireInt = 0;
        for (String word : listWords) {
            if (word.equals("FURY")) {
                if (!bufferRes.isEmpty() && fireInt > 0) {
                    result.append(bufferRes);
                    bufferRes = "";
                    fireInt = 0;
                }

                if (fureInt == 0) {
                    bufferRes += ("I am furious. ");
                } else if (fureInt > 0) {
                    bufferRes = bufferRes.substring(0, 4) + " really" + bufferRes.substring(4, bufferRes.length());
                }
                fureInt++;
            } else if (word.equals("FIRE")) {
                if (!bufferRes.isEmpty() && fureInt > 0) {
                    result.append(bufferRes);
                    bufferRes = "";
                    fureInt = 0;
                }

                if (fireInt == 0) {
                    bufferRes += ("You are fired! ");
                } else if (fireInt > 0) {
                    bufferRes = bufferRes.substring(0, 3) + " and you" + bufferRes.substring(3, bufferRes.length());
                }
                fireInt++;
            }
        }
        result.append(bufferRes.trim());

        System.out.println(result);
    }
}
