package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class FormatWordsIntoSentence {
    public static void main(String[] args) {
        String[] arrayWords = {"ronin", "samurai", "", null}; // System.out: ronin, samurai and ninja
        ArrayList<String> listWords = new ArrayList<>(Arrays.asList(arrayWords));
        listWords.removeAll(Arrays.asList("", null));

        StringBuilder text = new StringBuilder();
        for (String str : listWords) {
            if (str.isEmpty()) continue;
            if (text.toString().equals("")) {
                text.append(str);
            } else if (str.equals(listWords.get(listWords.size() - 1))) {
                text.append(" and ").append(str);
                break;
            } else text.append(", ").append(str);
        }
        System.out.println(text);
    }
}
