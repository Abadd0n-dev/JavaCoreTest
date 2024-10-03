package workingWithCustomersAndListingHolidays;

import java.time.LocalDate;
import java.time.Month;

public class Holidays {
    private static final LocalDate today = LocalDate.now();
    public static void celebrateHolidays(Employee[] employees) {
        try {
            if (today.getMonth() == Month.JANUARY && today.getDayOfMonth() == 1) {
                for (Employee employee : employees) {
                    System.out.println("С Новым Годом, " + employee.getName() + "!");
                }
            }

            if (today.getMonth() == Month.MARCH && today.getDayOfMonth() == 8) {
                for (Employee employee : employees) {
                    if (employee.getGender() == Gender.FEMALE) {
                        System.out.println("С 8 марта, " + employee.getName() + "!");
                    }
                }
            }

            if (today.getMonth() == Month.FEBRUARY && today.getDayOfMonth() == 23) {
                for (Employee employee : employees) {
                    if (employee.getGender() == Gender.MALE) {
                        System.out.println("С 23 февраля, " + employee.getName() + "!");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
