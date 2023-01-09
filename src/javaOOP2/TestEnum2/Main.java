package javaOOP2.TestEnum2;

public class Main {
    public static void main(String[] args) {

        Rank[] col = Rank.values();
        Suit[] sui = Suit.values();
        Card[] coloda = new Card[col.length * sui.length];
        int i = 0;
        for (Rank cardRank : col) {
            for (Suit cardSuit : sui) {
                coloda[i++] = new Card(cardSuit, cardRank);
            }
        }
// вывод всей колоды карт на экран
        for (Card card : coloda) {
            System.out.println(card);
        }
    }
}
