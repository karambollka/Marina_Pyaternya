package ua.hillel.homework6_Poker;

public class PokerPlay {

    public static void main(String[] args) {
        PokerMachine pokerMachine = new PokerMachine();

        Card[] cards = pokerMachine.createDeck();
        pokerMachine.shuffleDeck(cards);
        pokerMachine.serveCards(cards,4);
    }
}
