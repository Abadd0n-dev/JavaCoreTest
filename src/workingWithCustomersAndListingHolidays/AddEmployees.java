package workingWithCustomersAndListingHolidays;

public class AddEmployees {
    public static void addingEmployees () {
        Employee[] employees = {
                new Employee("Алиса", Gender.FEMALE),
                new Employee("Андрей", Gender.MALE),
                new Employee("Максим", Gender.MALE),
                new Employee("Анастасия", Gender.FEMALE)
        };
        Holidays.celebrateHolidays(employees);
    }
}
