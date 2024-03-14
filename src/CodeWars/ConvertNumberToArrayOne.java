package CodeWars;

import java.util.Arrays;

public class ConvertNumberToArrayOne {
    public static void main(String[] args) {
        int number = 5;
        String strNum = "";

        int num = number;
        while (num > 0) {
            if (num > 9) {
                strNum += "9";
            } else strNum += num;
            num = num - 9;
        }

        System.out.println(Arrays.toString(new String[]{strNum, "1".repeat(number)}));
    }
}
