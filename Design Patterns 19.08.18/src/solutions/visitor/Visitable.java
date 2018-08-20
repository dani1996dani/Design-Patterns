package solutions.visitor;

public interface Visitable {

    int accept(Visitor visitor);
}
