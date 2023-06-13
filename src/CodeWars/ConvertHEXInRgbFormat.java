package CodeWars;

import java.util.Arrays;

public class ConvertHEXInRgbFormat {
    public static void main(String[] args) {
        String hex = "#ff9933";
        hex = hex.replace("#","");
        int[] array = new int[3];
        array[0] = Integer.valueOf(hex.substring(0, 2), 16);
        array[1] = Integer.valueOf(hex.substring(2, 4), 16);
        array[2] = Integer.valueOf(hex.substring(4, 6), 16);
        System.out.println(Arrays.toString(array));
    }
}
