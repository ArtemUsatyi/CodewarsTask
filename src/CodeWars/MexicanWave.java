package CodeWars;

import java.util.Arrays;

public class MexicanWave {
    public static void main(String[] args) {
        String text = "      two    words  ";
        StringBuilder myString = new StringBuilder(text);
        String[] arrayWave = new String[text.replaceAll(" ", "").length()];

        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if(myString.charAt(i) == ' ') continue;
            myString.setCharAt(i, Character.toUpperCase(myString.charAt(i)));
            arrayWave[j] = String.valueOf(myString);
            myString.setCharAt(i, Character.toLowerCase(myString.charAt(i)));
            j++;
        }
        System.out.println(Arrays.toString(arrayWave));
    }
}
