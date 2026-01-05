package se.jensen.linkan.springdice;

public class DiceRoll {
    private int value;

    public DiceRoll(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
