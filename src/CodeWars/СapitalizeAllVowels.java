package CodeWars;

public class СapitalizeAllVowels {
    public static void main(String[] args) {
        String st = "Hello World";
        System.out.println(st.
                replaceAll("a","A").
                replaceAll("o","O").
                replaceAll("e","E").
                replaceAll("u","U").
                replaceAll("i","I"));
    }
}
