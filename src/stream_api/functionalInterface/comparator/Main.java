package stream_api.functionalInterface.comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Функция сравнения, которая принимает 2 аргумента и возвращает
        // Отрицательное число, если первый объект МЕНЬШЕ второго
        // 0 - если объекты одинаковые.
        // Положительное число, если первыйобъект БОЛЬШЕ второго
        int[] array = new int[]{12, 41, 1, 8, 0, 3};

        // Преобразуем массив int в массив Integer
        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // Сортировка по возрастанию
        Arrays.sort(integerArray, Integer::compareTo);

//        Сортировка по убыванию, используйте:
//        Arrays.sort(integerArray, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1); // Сортировка по убыванию
//            }
//        });

        System.out.println(Arrays.toString(integerArray));
    }
}