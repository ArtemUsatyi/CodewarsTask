package patterns.decorator;

public class CashBackDebitCard implements Card{
    private Card card;

    public CashBackDebitCard(Card card) {
        this.card = card;
    }

    @Override
    public String createCard() {
        return card.createCard() + "карта с кэшбеком";
    }
}
