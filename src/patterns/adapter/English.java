package patterns.adapter;

public class English implements EnglishTranslate {
    @Override
    public String getText() {
        return "Text on English";
    }
}
