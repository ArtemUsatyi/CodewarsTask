package CodeWars;

public class InvertedWordsInString {
    public static void main(String[] args) {
        String str = "I love America";
        String[] strArray = str.split(" ");
        String newStr = "";
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > 4) {
                newStr += new StringBuffer(strArray[i]).reverse().toString().concat(" ");
            } else newStr += strArray[i].concat(" ");
        }
        System.out.println(newStr);
    }
}
