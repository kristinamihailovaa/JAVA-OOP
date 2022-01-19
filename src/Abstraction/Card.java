package Abstraction;

public class Card {
    private CardSuitPowers cardSuitPowers;
    private CardRanks cardRanks;

    public Card(CardSuitPowers cardSuitPowers, CardRanks cardRanks) {
        this.cardSuitPowers = cardSuitPowers;
        this.cardRanks = cardRanks;
    }

    public int getPower(){
        return cardRanks.getRankpowers()+cardSuitPowers.getCardSuitPowers();
    }
}
