package CodeWars;

public class SplitStringCamelCase {
    public static void main(String[] args) {
        String text = "camelCase";
        String newText = "";
        for (String w : text.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            newText += w + " ";
        }
        System.out.println(newText.trim());
    }

//    Альтернативный варинт
//    System.out.println(input.replaceAll("([A-Z])", " $1"));
}
