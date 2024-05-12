package homework_nr_10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Ruk", 29, "Software Engineering");

        Predicate<Employee> departmentPredicate = e -> e.getDepartment().equals("Software Engineering");
        Predicate<Employee> agePredicate = e -> e.getAge() > 20;
        Predicate<Employee> namePredicate = e -> e.getName().startsWith("A");

        testEmployee(employee, departmentPredicate, "Employee works in the Software Engineering department");
        testEmployee(employee, agePredicate, "Employee over 20 years old");
        testEmployee(employee, namePredicate, "Employee name starts with A");

        Employee randomEmployee = new Employee(generateRandomString(), "Smith", 30, "HR");
        testEmployee(randomEmployee, departmentPredicate, "Employee works in the Software Engineering department");
        testEmployee(randomEmployee, agePredicate, "Employee over 20 years old");
        testEmployee(randomEmployee, namePredicate, "Employee name starts with A");
    }

    public static void testEmployee(Employee employee, Predicate<Employee> testMethod, String message) {
        if (testMethod.test(employee)) {
            System.out.println(message);
        }
    }

    public static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}