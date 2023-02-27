package Generics;

public class Main {
    static int countStr = 0;

    public static void main(String[] args) {

        String[] arrayString = {"Java", ",", "I", "love", "You"};

        Integer[] arrayInt = {1, 2, 3, 4, 5};

        Float[] arrayFloat = {3f, 4f, 5f, 6f, 7f};

        methodConsole(arrayString);
        methodConsole(arrayInt);
        methodConsole(arrayFloat);

    }

    @SafeVarargs
    public static <T> void methodConsole(T... array) {

        System.out.print(++countStr + ". :");

        for (T element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
    }
}
