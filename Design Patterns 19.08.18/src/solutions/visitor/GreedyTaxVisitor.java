package solutions.visitor;

public class GreedyTaxVisitor implements Visitor {


    @Override
    public int visit(Necessity necessity) {
        return necessity.getPrice() + 2;
    }

    @Override
    public int visit(Car car) {
        int carPrice = car.getPrice();
        return 2*carPrice;
    }

    @Override
    public int visit(House house) {
        int housePrice = house.getPrice();
        return housePrice + housePrice/2;
    }
}
