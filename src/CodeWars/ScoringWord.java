package CodeWars;

public class ScoringWord {
    public static void main(String[] args) {
        String test = "take me to semynak";

        String text = "";
        int countFirst = 0;

        for (String wordInArray : test.split(" ")) {
            int countSecond = 0;

            for (char letter :  wordInArray.toCharArray()) countSecond += letter - 96;

            if (countSecond > countFirst) {
                countFirst = countSecond;
                text = wordInArray;
            }
        }
        System.out.println(text);
    }
}
