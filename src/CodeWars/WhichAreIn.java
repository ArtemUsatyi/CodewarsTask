package CodeWars;

import java.util.ArrayList;

public class WhichAreIn {
    public static void main(String[] args) {
        String[] array1 = {"livel", "aliv", "ha"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        ArrayList<String> list = new ArrayList<>();

        for (String prefix : array1) {
            for (String wordArray : array2) {
                for (int i = 0; i + prefix.length() <= wordArray.length(); i++) {
                    if (prefix.equals(wordArray.substring(i, i + prefix.length()))) {
                        if (!list.contains(prefix)) list.add(prefix);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
