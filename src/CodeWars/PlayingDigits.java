package CodeWars;

public class PlayingDigits {
    public static void main(String[] args) {
        int n = 89;
        int p = 1;
        String[] digits2 = String.valueOf(n).split("(?<=.)");
        int result = 0;
        for (String element : digits2) {
            result = (int) Math.pow(Double.parseDouble(element), p) + result;
            p++;
        }
        if (result % n == 0)
            System.out.println(result / n);
        else System.out.println(-1);
    }
}
