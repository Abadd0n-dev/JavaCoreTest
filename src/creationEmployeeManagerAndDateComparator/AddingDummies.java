package creationEmployeeManagerAndDateComparator;

import java.util.ArrayList;
import java.util.List;

public class AddingDummies {
    private static final List<Employee> employees = new ArrayList<>();
    public static void addDumies () {
        Employee emp1 = new Employee("Иванов Тимофей", 50000, 2020, 5, 15);
        Employee emp2 = new Employee("Никифоров Илья", 60000, 2019, 8, 25);
        Manager manager = new Manager("Петров Константин", 80000, 2018, 3, 10);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(manager);
    }

    public static void printDumies () {
        System.out.println("До повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }

        Manager.increaseSalary(employees, 10);

        System.out.println("\nПосле повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
    }
}
