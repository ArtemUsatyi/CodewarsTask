package CodeWars;


public class DigitalRoot {
    public static void main(String[] args) {
        int num = 456599546;

        while (num > 9) {
            num = num / 10 + num % 10;
        }
        System.out.println(num);
    }
}
