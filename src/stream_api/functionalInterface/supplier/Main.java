package stream_api.functionalInterface.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //Аргумент не принимает, но возвращает тип
        Supplier<Integer> random = () -> new Random().nextInt(30);
        System.out.println(random.get());
    }
}
