package CodeWars;

public class PalindromeString {

    public static void main(String[] args) {
        String word = "p1appap123-=.";
        String result = word.replaceAll("[^a-zA-Z]", "");

        String text = new StringBuilder(result).reverse().toString();

        if (result.equals(text)){
            System.out.println("Правда");
        } else System.out.println("Ложь");
    }
}
