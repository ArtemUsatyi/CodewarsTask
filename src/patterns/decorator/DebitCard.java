package patterns.decorator;

public class DebitCard implements Card {
    @Override
    public String createCard() {
        return "Создание карты - ";
    }
}
