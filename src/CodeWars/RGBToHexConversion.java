package CodeWars;

public class RGBToHexConversion {
    public static void main(String[] args) {
        int numR = 15;
        int numG = 10;
        int numB = 11;
        String hexR = convertNumber(numR);
        String hexG = convertNumber(numG);
        String hexB = convertNumber(numB);
        System.out.println(hexR+hexG+hexB);
    }

    public static String convertNumber(int num) {
        int number = num;
        if (number > 255) number = 255;
        else if (number < 0) number = 0;
        String hexNum = Integer.toHexString(number);
        if (hexNum.length() == 1) return hexNum = "0" + hexNum.toUpperCase();
        else return hexNum.toUpperCase();
    }

//    Альтернативный вариант
//    return String.format("%02X%02X%02X", r, g, b);
}
