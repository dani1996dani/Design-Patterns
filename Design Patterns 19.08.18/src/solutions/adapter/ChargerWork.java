package solutions.adapter;

public class ChargerWork {

    Iphone myPhone;
    Charger availableCharger;

    public void setMyPhone(Iphone myPhone) {
        this.myPhone = myPhone;
    }

    public void setAvailableCharger(Charger availableCharger) {
        this.availableCharger = availableCharger;
    }

    public void chargeMyPhone() {
        while (myPhone.isNotFull()) {
            availableCharger.charge(myPhone);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
