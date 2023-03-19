package CodeWars;

import java.util.Arrays;

public class NumberArmstrong {
    public static void main(String[] args) {
        int number = 1634;
        boolean numArmstrong = false;
        String numberStr = String.valueOf(number);
        String[] numberArray = numberStr.split("(?<=.)");

        int numberCount = 0;
        for (int i = 0; i < numberArray.length; i++) {
            numberCount += (int) Math.pow(Integer.parseInt(numberArray[i]), numberArray.length);
        }

        if (number == numberCount) System.out.println("Ура!!!");
        else System.out.println("Ужас ");
    }
}
