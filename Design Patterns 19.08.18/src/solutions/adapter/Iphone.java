package solutions.adapter;

public class Iphone extends Phone {

    public Iphone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isNotFull() {
        return batteryLevel < 100;
    }
}
