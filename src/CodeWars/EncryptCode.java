package CodeWars;

public class EncryptCode {
    public static void main(String[] args) {
        String code = "A wise old owl lived in an oak";
        String newCode = "";
        for (String elem : code.split(" ")) {
            if (code.isEmpty()) break;
            char[] ch = elem.substring(1).toCharArray();
            if (elem.length() > 1) {
                ch = elem.substring(1).toCharArray();
                char temp = ch[0];
                ch[0] = ch[ch.length - 1];
                ch[ch.length - 1] = temp;
            }
            newCode += (int) elem.charAt(0) + String.valueOf(ch) + " ";
        }
        System.out.println(newCode.trim());
    }
}
