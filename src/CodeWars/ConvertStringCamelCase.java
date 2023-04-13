package CodeWars;

public class ConvertStringCamelCase {
    public static void main(String[] args) {
        String s = "you_Have_north";
        String[] textArray = s.split("[-_]");
        String newString = "";
        if (!textArray[0].isEmpty()) {
            newString = textArray[0].substring(0, 1).concat(textArray[0].substring(1));
        }
        for (int i = 1; i < textArray.length; i++) {
            newString = newString + textArray[i].substring(0, 1).toUpperCase().concat(textArray[i].substring(1));
        }
        System.out.println(newString);
    }
}
