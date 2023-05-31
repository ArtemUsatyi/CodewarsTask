package CodeWars;

public class PalindromeNumber {
    static int number = 121;
    public static void main(String[] args) {
        int number = 121;
        String text = new StringBuilder(String.valueOf(number)).reverse().toString();
        if (String.valueOf(number).equals(text))
            System.out.println(number + " reads as " + number + " from left to right and from right to left.");
        else
            System.out.println("From left to right, it reads " + number + ". From right to left, it becomes " + text + ". Therefore it is not a palindrome.");

    }
}
