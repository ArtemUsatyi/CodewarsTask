package CodeWars;

import java.util.Arrays;

public class OutputPhoneNumber {
    static StringBuilder phoneNumber = new StringBuilder("(");

    public static void main(String[] args) {
        int[] arrayPhoneNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        concatStringPhoneNumberOfArray(arrayPhoneNumber, 3, 0);
        phoneNumber.append(") ");

        concatStringPhoneNumberOfArray(arrayPhoneNumber, 6, 3);
        phoneNumber.append("-");

        concatStringPhoneNumberOfArray(arrayPhoneNumber, arrayPhoneNumber.length, 6);

        System.out.println(phoneNumber);
    }

    public static void concatStringPhoneNumberOfArray(int[] array, int mountFormatPhone, int valueElem) {
        for (int element = valueElem; element < mountFormatPhone; element++) {
            phoneNumber.append(array[element]);
        }
    }
}
