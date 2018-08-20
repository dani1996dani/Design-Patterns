package solutions.visitor;

public class BasicTaxVisitor implements Visitor {


    @Override
    public int visit(Necessity necessity) {
        return necessity.getPrice();
    }

    @Override
    public int visit(Car car) {
        int carPrice = car.getPrice();
        return carPrice + carPrice/5;
    }

    @Override
    public int visit(House house) {
        int housePrice = house.getPrice();
        return housePrice + housePrice/4;
    }
}
