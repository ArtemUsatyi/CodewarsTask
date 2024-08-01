package stream_api.functionalInterface.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Принимает аргумент и возвращает тип Boolean
        Predicate<Integer> validAge = (age) -> age > 17;
        System.out.println(validAge.test(20));
    }
}
