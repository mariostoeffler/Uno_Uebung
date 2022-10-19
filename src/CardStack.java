public class CardStack {
    private Card[] kartenArray = new Card[10];
    private int counter;

    public CardStack(Card[] karten) {
        this.kartenArray = karten;
        this.counter = -1;
    }

    public void push(Card newCard) {
        kartenArray[++counter] = newCard;
    }

    public Card pop() {
        return this.kartenArray[this.counter--];
    }

    public Card[] getKartenArray() {
        return kartenArray;
    }
}
