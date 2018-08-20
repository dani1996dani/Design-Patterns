package solutions.visitor;

public interface Visitor {

    int visit(Necessity necessity);
    int visit(Car car);
    int visit(House house);
}
