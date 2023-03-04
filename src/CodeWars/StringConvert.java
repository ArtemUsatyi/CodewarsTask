package CodeWars;

public class StringConvert {
    public static void main(String[] args) {
        // Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1
        String text = "Fundamentals";
        String newText = text.replaceAll("[aA]", "4").replaceAll("[eE]","3").replaceAll("l","1");
        System.out.println(newText);
    }
}
