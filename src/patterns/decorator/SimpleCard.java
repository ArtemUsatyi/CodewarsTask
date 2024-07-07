package patterns.decorator;

public class SimpleCard implements Card {
    private Card card;

    public SimpleCard(Card card) {
        this.card = card;
    }

    @Override
    public String createCard() {
        return card.createCard() + "простая карта без бонусов.";
    }
}
