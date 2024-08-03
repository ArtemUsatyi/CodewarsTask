package stream_api.terminal.reduce;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
//        Функция reduce можем производить операции слоежния элементов в листе, вычислять min, max в листе.

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(e -> System.out.println("Сумма чисел - " + e));

        integers.stream()
                .reduce(Integer::min)
                .ifPresent(e -> System.out.println("Минимальное число - " + e));
    }
}
