package stream_api.functionalInterface.consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //��������� ���� ��������, �� ������ �� ���������, �� ���������� �����-�� ��������.
        Consumer<String> test = (str) -> {
            if (str == null) System.out.println("Str is null");
            else if (str.equals("text")) System.out.println("Str is - " + str);
        };
        test.accept(null);
    }
}
