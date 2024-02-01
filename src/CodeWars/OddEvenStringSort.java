package CodeWars;

public class OddEvenStringSort {
    public static void main(String[] args) {
        String test = "CodeWars";

        String[] array = test.replaceAll(" ", "").split("");
        StringBuilder newTest = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                newTest.append(array[i]);
            }
        }
        newTest.append(" ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                newTest.append(array[i]);
            }
        }
        System.out.println(newTest);
    }
}
