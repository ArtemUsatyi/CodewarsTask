package CodeWars;

public class VowelCount {
    public static void main(String[] args) {
        String str = "aaaaoooo";
        char[] vowelArray = {'a', 'o', 'i', 'e', 'u'};
        int count = 0;
        for (char vowel : vowelArray) {
            count += (int) str.chars()
                    .filter(e -> e == vowel)
                    .count();
        }
        System.out.println(count);
    }
}
