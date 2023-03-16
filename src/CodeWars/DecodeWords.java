package CodeWars;

import java.util.Arrays;

public class DecodeWords {
    public static void main(String[] args) {
        String textVoicesDog = "Woof-shhh-woofwoof!";
        // english alphabet 26 letters
        String[] arrayTextVoicesDog = textVoicesDog.toLowerCase().replaceAll("!", "!-").split("-");
        System.out.println(Arrays.asList(arrayTextVoicesDog));

        int counterWord = 0;
        String decoderVoicesOfWord = "";
        for (String wordVoicesDog : arrayTextVoicesDog) {
            if (wordVoicesDog.trim().equals("woof")) {
                counterWord++;
            } else if (counterWord > 25) decoderVoicesOfWord = "just barking!";
            else if (wordVoicesDog.trim().equals("woof!")) {
                decoderVoicesOfWord = decoderVoicesOfWord + ((char) (counterWord + 97));
                counterWord = 0;
            } else if (wordVoicesDog.equals("shhhh!")) decoderVoicesOfWord = "nothing to decode!";
            else if (counterWord == 0) decoderVoicesOfWord = "a";
        }
        if (counterWord > 0) decoderVoicesOfWord = decoderVoicesOfWord + ((char) (counterWord + 97));

        System.out.println(decoderVoicesOfWord);
    }
}
