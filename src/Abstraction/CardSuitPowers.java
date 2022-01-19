package Abstraction;

public enum CardSuitPowers {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int cardSuitPowers;

    CardSuitPowers(int cardSuitPowers) {
        this.cardSuitPowers = cardSuitPowers;
    }

    public int getCardSuitPowers() {
        return cardSuitPowers;
    }

    public void setCardSuitPowers(int cardSuitPowers) {
        this.cardSuitPowers = cardSuitPowers;
    }

}
