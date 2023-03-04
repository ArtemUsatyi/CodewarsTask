package CodeWars;

public class IndexedСapitalization {

    public static void main(String[] args) {
        int[] array = {1, 2, 100};
        StringBuilder text = new StringBuilder("привет");

        for (int element : array) {
            if (text.length() <= element) break;
            text.setCharAt(element, Character.toUpperCase(text.charAt(element)));
        }
        System.out.println(text);
    }
}
