package solutions.adapter;

public class Main {

    public static void main(String[] args) {

        Charger charger = new ChargerAdapter();
        ChargerWork chargerWork = new ChargerWork();
        chargerWork.setAvailableCharger(charger);

        Iphone myPhone = new Iphone(50);
        chargerWork.setMyPhone(myPhone);

        System.out.println("Thank god I found a charger, I am at " + myPhone.getBatteryLevel() + "%");

        chargerWork.chargeMyPhone();
    }
}
