package stream_api.functionalInterface.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Принимает T аргумент, Возвращает R аргумент
        Function<Integer, String> test = (count) -> {
            if (count == 1) return "Первый";
            else if (count == 2) return "Второй";
            else if (count == 3) return "Третий";
            else return "default";
        };

        System.out.println(test.apply(0));
    }
}
