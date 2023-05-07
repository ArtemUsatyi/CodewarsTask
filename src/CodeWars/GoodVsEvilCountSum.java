package CodeWars;

import java.util.Arrays;

public class GoodVsEvilCountSum {
    public static void main(String[] args) {
        String goodAmounts = "2704 3148 3211 7900 3554 8815";
        String evilAmounts = "4550 7611 9648 6265 4146 7937 3854";
        int goodValue = Arrays.stream(goodAmounts.split(" ")).mapToInt(Integer::valueOf).sum();
        int evilValue =Arrays.stream(evilAmounts.split(" ")).mapToInt(Integer::valueOf).sum();
        System.out.println(goodValue);
        System.out.println(evilValue);
        if(goodValue>evilValue) System.out.println("Добро победило");
        else if (evilValue>goodValue) System.out.println("Зло победило");
        else System.out.println("Ничья");
    }
}
