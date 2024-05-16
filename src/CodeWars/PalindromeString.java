package CodeWars;

public class PalindromeString {

    public static void main(String[] args) {
        String word = "p1appap123-=.qwe";
        String result = word.replaceAll("[^a-zA-Z]", "");

        String text = new StringBuilder(result).reverse().toString();

        if (result.equals(text)) {
            System.out.println("������");
        } else System.out.println("����");

        int start = 0;
        int end = result.length() - 1;
        while (start < end) {
            if (result.charAt(start) != result.charAt(end)) {
                System.out.println("����");
                break;
            }
            start++;
            end--;
        }
        System.out.println("������");
    }
}
