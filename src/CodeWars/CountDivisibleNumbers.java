package CodeWars;

public class CountDivisibleNumbers {
    public static void main(String[] args) {
        long x = 101;
        long y = 2147483647;
        long k = 11;

        long count = 0;
//        for (long i = x; x <= i && i <= y; i++) {
//            if (i % k == 0) {
//                count++;
//            }
//        }
        System.out.println(y / k - x / k + (x % k > 0 ? 0 : 1));

        System.out.println(count);
    }
}
