package creationEmployeeManagerAndDateComparator;

import java.util.List;

public class Manager extends Employee {
    public Manager (String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public static void increaseSalary(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() * (1 + percentage / 100));
            }
        }
    }
}
