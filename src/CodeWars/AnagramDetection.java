package CodeWars;

public class AnagramDetection {
    public static void main(String[] args) {
        String test = "ad";
        String original = "bc";
        if (test.length() == original.length()) {
            for (String symbol : test.toLowerCase().split("(?!^)")) {
                original = original.toLowerCase().replaceAll(symbol, "");
            }
            if (original.isEmpty()) System.out.println(true);
            else System.out.println(false);
        } else System.out.println(false);


//        Альтернативный метод решения задачи
//        Stream.of(test.toLowerCase().split(""))
//                .sorted()
//                .collect(Collectors.joining())
//                .equals(
//                        Stream.of(original.toLowerCase()
//                                        .split(""))
//                                .sorted()
//                                .collect(Collectors.joining()));
    }
}
