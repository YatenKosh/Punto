package javaOOP2.TestEnum2;

public class Card {
    private final Suit cardSuit;
    private final Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The card: " + cardSuit + "_" + cardRank;
    }
}
