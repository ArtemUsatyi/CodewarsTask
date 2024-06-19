package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        English EnglishText = new English();
        TranslateAdapter translateAdapter = new TranslateAdapter(EnglishText);

        TranslatedTest translate = new TranslatedTest();
        translate.getText(translateAdapter);
    }
}
