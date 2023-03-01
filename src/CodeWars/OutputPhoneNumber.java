package CodeWars;

import java.util.Arrays;

public class OutputPhoneNumber {
    public static void main(String[] args) {
        int[] arrayPhoneNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        StringBuilder phoneNumber = new StringBuilder("(");

        int countNumber = 3;
        for (int element = 0; element < countNumber; element++) {
            phoneNumber.append(arrayPhoneNumber[element]);
        }
        phoneNumber.append(") ");

        countNumber = 6;
        for (int element = 3; element < countNumber; element++) {
            phoneNumber.append(arrayPhoneNumber[element]);
        }
        phoneNumber.append("-");

        countNumber = arrayPhoneNumber.length;
        for (int element = 6; element < countNumber; element++) {
            phoneNumber.append(arrayPhoneNumber[element]);
        }

        System.out.println(phoneNumber);
    }
}
