package patterns.abstract_fabric;

public class CardFactory implements AbstractFabricCard {
    @Override
    public CreditCard getCreditCard() {
        return new CreditCard();
    }

    @Override
    public DebitCard getDebitCard() {
        return new DebitCard();
    }
}
