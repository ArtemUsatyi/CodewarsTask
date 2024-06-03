package CodeWars;

import CodeWars.employee.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindForName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 2000),
                new Employee("Jane", 2100),
                new Employee("Mark", 1850),
                new Employee("James", 1980),
                new Employee("Jennifer", 2150)
        );

        double amount = employees.stream()
                .filter(employee -> employee.getName().startsWith("J"))
                .mapToDouble(Employee::getAmount)
                .average()
                .orElse(0);

        System.out.println(amount);
    }
}
