package solutions.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String department;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee){
        subordinates.remove(employee);
    }

    public int getSalaryofTree(){
        int result = salary;
        for(Employee e : subordinates)
            result += e.getSalaryofTree();

        return result;
    }
}
