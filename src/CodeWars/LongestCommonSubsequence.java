package CodeWars;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "132535365";
        String text2 = "123456789";


        System.out.println(lcs(text1, text2));
    }
    public static String lcs(String text1, String text2) {
        String MaxResult = "";
        String result = "";
        for (int i = 0; i < text1.length(); i++) {
            String currRes = text1.substring(i, i + 1);
            int posRes = text2.indexOf(currRes);
            if (posRes >= 0) {
                result = currRes + lcs(text1.substring(i + 1), text2.substring(posRes + 1));
            }
            if (result.length() > MaxResult.length()) {
                MaxResult = result;
            }
        }
        return MaxResult;
    }
}
