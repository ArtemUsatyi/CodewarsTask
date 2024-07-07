package patterns.abstract_fabric;

public class Main {
    public static void main(String[] args) {
        AbstractFabricCard fabricCard = new CardFactory();
        DebitCard debitCard = fabricCard.getDebitCard();
        debitCard.createCard();
        CreditCard creditCard = fabricCard.getCreditCard();
        creditCard.createCard();
    }
}
