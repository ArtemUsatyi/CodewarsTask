package CodeWars;

public class DecodeTheMorseCode {
    public static void main(String[] args) {
        char[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

        String strMorse = ".... . -.--   .--- ..- -.. .";
        StringBuilder strLetters = new StringBuilder();

        for (String symbol : strMorse.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(symbol)) {
                    strLetters.append(english[i]);
                    break;
                } else if (symbol.equals("")) {
                    strLetters.append(" ");
                    break;
                }
            }
        }
        String strText = strLetters.toString();
        System.out.println(strText.trim().replaceAll("\\s+", " "));
    }
}
