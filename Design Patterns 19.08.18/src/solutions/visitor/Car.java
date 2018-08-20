package solutions.visitor;

public class Car implements Visitable {

    int price;

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
