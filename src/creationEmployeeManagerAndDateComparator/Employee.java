package creationEmployeeManagerAndDateComparator;

public class Employee {
    private String name;
    private double salary;
    private int year;
    private int month;
    private int day;

    public Employee (String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public static int compareDates (int y1, int m1, int d1, int y2, int m2, int d2) {
        return Integer.compare(y1, y2) != 0 ? Integer.compare(y1, y2) :
                Integer.compare(m1, m2) != 0 ? Integer.compare(m1, m2) :
                        Integer.compare(d1, d2);
    }

}
