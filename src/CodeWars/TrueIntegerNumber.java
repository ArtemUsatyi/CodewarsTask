package CodeWars;

public class TrueIntegerNumber {
    public static void main(String[] args) {
        String str = ".1235555";
        System.out.println(str.matches("[+-]?\\d*(\\.\\d+)?\\d*(\\.)?"));

        float x = 10.7F;
        System.out.println(x % 1);
        if (x % 1 == 0) System.out.println(x);
    }
}
