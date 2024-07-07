package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Card card = new SimpleCard(new DebitCard());
        System.out.println(card.createCard());

        Card card1 = new CashBackDebitCard(new DebitCard());
        System.out.println(card1.createCard());
    }
}
