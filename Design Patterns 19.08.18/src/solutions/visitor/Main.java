package solutions.visitor;

public class Main {

    public static void main(String[] args) {
        BasicTaxVisitor basicTaxVisitor = new BasicTaxVisitor();
        GreedyTaxVisitor greedyTaxVisitor = new GreedyTaxVisitor();

        Necessity milk = new Necessity(3);
        Car honda = new Car(50_000);
        House mansion = new House(20_000_000);

        System.out.println("Basic Tax - Milk Price: " + milk.accept(basicTaxVisitor) + " \u20AA");
        System.out.println("Basic Tax - Honda Price: " + honda.accept(basicTaxVisitor) + " \u20AA");
        System.out.println("Basic Tax - Mansion Price: " + mansion.accept(basicTaxVisitor) + " \u20AA");

        System.out.println();

        System.out.println("Greedy Tax - Milk Price: " + milk.accept(greedyTaxVisitor) + " \u20AA");
        System.out.println("Greedy Tax - Honda Price: " + honda.accept(greedyTaxVisitor) + " \u20AA");
        System.out.println("Greedy Tax - Mansion Price: " + mansion.accept(greedyTaxVisitor) + " \u20AA");
    }
}
