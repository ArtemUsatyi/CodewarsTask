package patterns.adapter;

public class TranslateAdapter implements RussiaTranslate {
    public EnglishTranslate text;

    public TranslateAdapter(EnglishTranslate text) {
        this.text = text;
    }

    @Override
    public String getText() {
        String eng = text.getText();
        return "Текст на Английском - " + eng;
    }
}
