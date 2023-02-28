package HomeWork28;
import java.util.Iterator;
import java.util.LinkedList;
public class Card {
    /*
     Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
   */
    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String toString() {
        return "Card Type: " + cardType + " and Interest Rate: " + interestRate;
    }

    public static void main(String[] args) {
        LinkedList<Card> cardList = new LinkedList<Card>();
        cardList.add(new Card(0.1, "Credit"));
        cardList.add(new Card(0.2, "Debit"));
        cardList.add(new Card(0.15, "Prepaid"));

        for (int i = 0; i < cardList.size(); i++) {
            Card card = cardList.get(i);
            System.out.println(card.toString());
        }

        for (Card card : cardList) {
            System.out.println(card.toString());
        }

        Iterator<Card> iterator = cardList.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card.toString());
        }
    }

}






