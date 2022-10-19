public class CardDemo {

    public static void main(String[] args) {

        Card karte1 = new Card(4, "blue");
        Card karte2 = new Card(1, "green");
        Card karte3 = new Card(5, "yellow");
        Card karte4 = new Card(6, "red");
        Card karte5 = new Card(2, "blue");

        Card[] kartenArray1 = new Card[10];


        CardStack neuesKartendeck = new CardStack(kartenArray1);

        neuesKartendeck.push(karte1);
        neuesKartendeck.push(karte2);
        neuesKartendeck.push(karte3);
        neuesKartendeck.push(karte4);
        neuesKartendeck.push(karte5);

        System.out.println(neuesKartendeck.pop().toString());
        System.out.println(neuesKartendeck.pop().toString());
        System.out.println(neuesKartendeck.pop().toString());
        System.out.println(neuesKartendeck.pop().toString());
        System.out.println(neuesKartendeck.pop().toString());

        neuesKartendeck.push(karte4);
        neuesKartendeck.push(karte5);

        System.out.println(neuesKartendeck.pop().toString());

    }
}
