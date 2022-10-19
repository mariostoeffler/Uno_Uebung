public class Card {

    private int value;
    private String colour;

    public Card(int value, String colour) {
        this.value = value;
        this.colour = colour;
    }

    public void setColour(String colour) {
        if (this.colour == "blue" || this.colour == "green" || this.colour == "yellow" || this.colour == "red") {
        }
        System.out.println("bitte geben Sie eine gültige Farbe an!");
    }

    public void setValue(int value) {
        if (this.value > 0 && this.value < 10) {
            this.value = value;
        }
        System.out.println("bitte geben Sie einen gültigen Wert an! (Zwischen 1 und 9)");
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}