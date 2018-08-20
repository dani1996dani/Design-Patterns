package solutions.adapter;

public class GalaxyCharger {

    int amountToCharge = 5;

    public void chargeGalaxy(Phone phone) {

        phone.addToBatteryLevel(amountToCharge);
        System.out.println("I Think I'm Charging a Galaxy Phone Now, Currently at: " + phone.getBatteryLevel() + "%");
    }

}
