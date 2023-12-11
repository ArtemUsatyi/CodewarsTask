package CodeWars;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;

        int reverse = 0;
        while (x != 0) {
            int mod = x % 10;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse > Integer.MAX_VALUE / 10 && mod > 7))
                System.out.println(0);
            if (reverse < Integer.MIN_VALUE / 10 || (reverse < Integer.MIN_VALUE / 10 && mod > -8))
                System.out.println(0);

            reverse = reverse * 10 + mod;
        }
        System.out.println(reverse);
    }
}
