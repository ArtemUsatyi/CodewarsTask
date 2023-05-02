package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RomanNumeralsEncoder {
    public static void main(String[] args) {
        int number = 1000;
        ArrayList<String> listArabic = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "20", "30", "40", "50", "60", "70", "80", "90",
                "100", "200", "300", "400", "500", "600", "700", "800", "900",
                "1000", "2000", "3000"));
        String[] arrayRomanNumber = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
                "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
                "M", "MM", "MMM"};

        List<String> listNumber = Arrays.stream(String.valueOf(number).split("")).collect(Collectors.toList());

        int count = listNumber.size() - 1;
        String zero = "";
        while (count > 0) {
            zero += "0";
            count--;
        }

        for (int i = 0; i < listNumber.size(); i++) {
            listNumber.set(i, listNumber.get(i) + zero);
            if (!zero.isEmpty()) zero = zero.substring(1);
        }

        StringBuilder text = new StringBuilder();
        for (String elem : listNumber) {
            for (String numArabic : listArabic) {
                if (elem.equals(numArabic)) text.append(arrayRomanNumber[listArabic.indexOf(elem)]);
            }
        }
        System.out.println(text.toString());
    }
//    Алтернативный вариант
//    static final String R1000[] = {"", "M", "MM", "MMM" };
//    return R1000[n/1000]+R100[n%1000/100]+R10[n%100/10]+R1[n%10];
}
