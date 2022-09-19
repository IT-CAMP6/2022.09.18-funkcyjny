package pl.camp.it.stream;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Janusz1", "Kowalski1", 3000.00, Employee.Position.LOW));
        employees.add(new Employee(2, "Janusz2", "Kowalski2", 3300.00, Employee.Position.LOW));
        employees.add(new Employee(3, "Janusz3", "Kowalski3", 3600.00, Employee.Position.LOW));
        employees.add(new Employee(4, "Janusz4", "Kowalski4", 3900.00, Employee.Position.MID));
        employees.add(new Employee(5, "Janusz5", "Kowalski5", 4200.00, Employee.Position.MID));
        employees.add(new Employee(6, "Janusz6", "Kowalski6", 4500.00, Employee.Position.MID));
        employees.add(new Employee(7, "Janusz7", "Kowalski7", 4800.00, Employee.Position.HIGH));
        employees.add(new Employee(8, "Janusz8", "Kowalski8", 5100.00, Employee.Position.HIGH));
        employees.add(new Employee(9, "Janusz9", "Kowalski10", 5400.00, Employee.Position.HIGH));
        employees.add(new Employee(10, "Janusz10", "Kowalski", 5700.00, Employee.Position.HIGH));

        employees.stream()
                .filter(em -> em.getPosition() == Employee.Position.MID)
                .filter(em -> em.getSalary() > 4000.00)
                .filter(em -> em.getSalary() < 5000.00)
                .peek(em -> em.setSalary(4800.00))
                .forEach(em -> System.out.println(em.getId()));

        employees.forEach(System.out::println);
    }
}
