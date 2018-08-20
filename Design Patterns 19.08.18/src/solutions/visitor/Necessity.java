package solutions.visitor;

public class Necessity implements Visitable{

    int price;

    public Necessity(int price) {
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
