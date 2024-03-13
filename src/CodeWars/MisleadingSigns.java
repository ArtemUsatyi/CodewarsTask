package CodeWars;

public class MisleadingSigns {
    public static void main(String[] args) {
        String guessWord = "snack";
        String saidWord = "snake";
        char[] friendsLetters = {'c'};

        String arrayLetter = "";
        if (guessWord.equals(saidWord)) System.out.println(guessWord.equals(saidWord));

        for (String letter : saidWord.split("")) {
            if (arrayLetter.equals("")) arrayLetter = guessWord;
            arrayLetter = arrayLetter.replaceAll(letter, "");
        }

        for (char findLetters : friendsLetters) {
            arrayLetter = arrayLetter.replaceAll(Character.toString(findLetters), "");
        }
        System.out.println(arrayLetter.isEmpty());
    }
}

