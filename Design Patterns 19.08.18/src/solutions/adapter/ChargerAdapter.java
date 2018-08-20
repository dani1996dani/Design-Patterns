package solutions.adapter;

public class ChargerAdapter implements Charger {

    GalaxyCharger galaxyCharger = new GalaxyCharger();

    @Override
    public void charge(Phone phone) {
        galaxyCharger.chargeGalaxy(phone);
    }
}
