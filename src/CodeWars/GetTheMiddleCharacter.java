package CodeWars;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        String word = "testing";
        int size = word.length();
        if (size % 2 == 1) System.out.println(word.charAt(size / 2));
        else System.out.println(word.substring(size / 2 - 1, size / 2) + word.substring(size / 2, size / 2 + 1));
    }
}
