package CodeWars;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "a aa";
        String[] arrayStr = s.split(" ");
        for (int i = arrayStr.length-1; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i].length());
        }
    }
}
