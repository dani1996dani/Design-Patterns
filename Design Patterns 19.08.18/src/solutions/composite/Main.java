package solutions.composite;

public class Main {

    public static void main(String[] args) {

        Employee ceo = new Employee("Casey","Managment",30_000);

        Employee cto = new Employee("Gilfoil","R&D",28_000);
        Employee coo = new Employee("John","Publicity",28_000);

        Employee dev1 = new Employee("Dylan","R&D",15_000);
        Employee dev2 = new Employee("Rob","R&D",13_000);

        Employee sales = new Employee("Jack","Publicity",11_000);
        Employee sales2 = new Employee("Jake","Publicity",11_000);

        ceo.addSubordinate(cto);
        ceo.addSubordinate(coo);

        cto.addSubordinate(dev1);
        cto.addSubordinate(dev2);

        coo.addSubordinate(sales);
        coo.addSubordinate(sales2);

        System.out.println("Under the CEO, the tree earns " + ceo.getSalaryofTree() + '\u20aa');


    }
}
