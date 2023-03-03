package CodeWars;

public class RemoveLetters {
    public static void main(String[] args) {
        // использовать регулярные выржания перебором проверять и удалять текст
        String test6 = "bxdfr5gaaairesv";
        System.out.println(test6.replaceAll("[aoieuAOIEU]",""));
    }
}
