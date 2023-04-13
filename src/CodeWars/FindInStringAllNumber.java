package CodeWars;

import java.util.HashMap;

public class FindInStringAllNumber {
    public static void main(String[] args) {
        String words = "4of Fo1r pe6ople g3ood th5e the2";
        HashMap<Integer, String> hashMap = new HashMap<>();
        String newString = "";

        for (String str : words.split(" ")) {
            if (str.matches(".*\\d.*")) {
                hashMap.put(Integer.valueOf(str.replaceAll("\\D", "")), str);
            }
        }
        for (int i = 1; i <= hashMap.size(); i++) {
            newString += hashMap.get(i).concat(" ");
        }
        System.out.println(newString.trim());

//        Альтернативный вариант
//        return Arrays.stream(words.split(" "))
//                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//                .reduce((a, b) -> a + " " + b).get();
    }
}
