package homework_nr_6;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 29, "Marketing");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Department: " + employee.getDepartment());


        Invoice invoice = new Invoice("X100", "TV", 3, 10200.0);
        System.out.println("Model: " + invoice.getModel());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Amount: " + invoice.getAmount());


        Date date = new Date(03, 4, 2024);
        date.displayDate();
    }
}
