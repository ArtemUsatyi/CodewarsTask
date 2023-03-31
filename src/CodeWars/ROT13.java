package CodeWars;

public class ROT13 {
    public static void main(String[] args) {
        //ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz (65-90)-(97-122)
        //NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm
        String str = "UryybJbeyq!";

        String strROT13 = "";
        for (char charElem : str.toCharArray()) {
            char intChar = charElem;
            if (intChar > 64 && intChar < 78) intChar = (char) (intChar + 13);
            else if (intChar > 77 && intChar < 91) intChar = (char) (intChar - 13);
            else if (intChar > 96 && intChar < 110) intChar = (char) (intChar + 13);
            else if (intChar > 109 && intChar < 123) intChar = (char) (intChar - 13);
            strROT13 +=intChar;
        }
        System.out.println(strROT13);
    }
}
