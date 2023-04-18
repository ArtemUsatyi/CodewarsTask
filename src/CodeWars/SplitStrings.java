package CodeWars;

public class SplitStrings {
    public static void main(String[] args) {
        String str = "abcdefrgthy";
        String[] strArray = str.split("(?<=\\G.{2})");
        if(strArray[strArray.length-1].length()==1) {
            strArray[strArray.length-1]=strArray[strArray.length-1]+"_";
        }
        for (String elem : strArray) {
            System.out.println(elem);
        }
    }
}
