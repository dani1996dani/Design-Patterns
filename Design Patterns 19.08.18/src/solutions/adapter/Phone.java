package solutions.adapter;

public class Phone {

    int batteryLevel;

    public void addToBatteryLevel(int amount) {
        this.batteryLevel += amount;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
