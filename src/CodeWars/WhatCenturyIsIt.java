package CodeWars;

public class WhatCenturyIsIt {
    public static void main(String[] args) {
        int year = 10000;
        String century = "";

        int thousandHundredYear = year / 100;
        if (year % 100 > 0) thousandHundredYear++;

        int hundredYear = thousandHundredYear % 10;
        if (year / 1000 == 1) hundredYear = 0;

        century = switch (hundredYear) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
        System.out.println(thousandHundredYear + century);
    }
}
