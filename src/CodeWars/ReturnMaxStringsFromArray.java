package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnMaxStringsFromArray {
    public static void main(String[] args) {
        int k = 3;
        String[] array = {"zone", "abigail", "theta", "form", "libe", "zas", "theta123", "abigail45"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        String maxLengthString = "";
        for (String elem : arrayList) {
            String lengthString = "";
            if ((arrayList.indexOf(elem) + k) <= arrayList.size()) {
                for (int i = 0; i < k; i++) {
                    lengthString = lengthString.concat(arrayList.get(arrayList.indexOf(elem) + i));
                }
            }
            if (maxLengthString.length() < lengthString.length()) maxLengthString = lengthString;
        }
    }
}
