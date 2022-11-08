package ua.hillel.homework6_Poker;

import java.util.Random;

public class PokerMachine {

    private static int noOfCards = 52;
    private static int noOfPlayers = 4;
    private static String[] cards = new String[noOfCards];

    public Card[] createDeck() {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Card[] cards = new Card[noOfCards];
        int index = 0;
        for (String suite : suites) {
            for (String value : values) {
                cards[index++] = new Card(suite, value);
            }
        }
        return cards;
    }


    public void shuffleDeck (Card[] cards) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfPlayers);

            Card card  = cards[in];
            cards[in] = cards[out];
            cards[out] = card;
        }
    }

    public void serveCards(Card[] cards, int noOfPlayers) {
        int index = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round " + round);
            for (int player = 1; player <= noOfPlayers; player++) {
                System.out.println(String.format("Player %d gets card %s%n", player, cards[index++]));
            }
            System.out.println("");
        }
    }
}
