//Testing the capabilities of the Employee app

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Victor", "", 100.33);
        Employee employee2 = new Employee("", "Voda", -500.17);
        Scanner reader = new Scanner(System.in);

        //display the initial data about our employees
        System.out.println("The initial information about our 2 employees is:");
        System.out.printf("\nEmployee1:\n\n%s\n", employee1.toString());

        System.out.printf("\nEmployee2:\n\n%s\n\n", employee2.toString());

        //we'll change the data for each employee and display de results

        //Employee1
        System.out.println("Introduce the data for the first employee.");
        System.out.print("New first name: ");
        String firstName1 = reader.nextLine();
        System.out.print("New last name: ");
        String lastName1 = reader.nextLine();
        System.out.print("New monthly salary: ");
        String salary1 = reader.nextLine();
        double monthlySalary1 = Double.parseDouble(salary1);

        System.out.println("The following changes occurred for the first employee.");
        System.out.printf("\nFirst name: %s ---> ", employee1.getFirstName());
        employee1.setFirstName(firstName1);
        System.out.printf("%s", employee1.getFirstName());
        System.out.printf("\nLast name: %s ---> ", employee1.getLastName());
        employee1.setLastName(lastName1);
        System.out.printf("%s", employee1.getLastName());
        System.out.printf("\nMonthly salary: %.2f ---> ", employee1.getMonthlySalary());
        employee1.setMonthlySalary(monthlySalary1);
        System.out.printf("%.2f\n\n", employee1.getMonthlySalary());

        //Employee2
        reader = new Scanner(System.in);
        System.out.println("Introduce the data for the second employee.");
        System.out.print("New first name: ");
        String firstName2 = reader.nextLine();
        System.out.print("New last name: ");
        String lastName2 = reader.nextLine();
        System.out.print("New monthly salary: ");
        String salary2 = reader.nextLine();
        double monthlySalary2 = Double.parseDouble(salary2);
        reader.close();

        System.out.println("The following changes occurred for the second employee.");
        System.out.printf("\nFirst name: %s ---> ", employee2.getFirstName());
        employee2.setFirstName(firstName2);
        System.out.printf("%s", employee1.getFirstName());
        System.out.printf("\nLast name: %s ---> ", employee2.getLastName());
        employee2.setLastName(lastName2);
        System.out.printf("%s", employee2.getLastName());
        System.out.printf("\nMonthly salary: %.2f ---> ", employee2.getMonthlySalary());
        employee2.setMonthlySalary(monthlySalary2);
        System.out.printf("%.2f\n\n", employee2.getMonthlySalary());

        //display each employee's yearly salary before and after a 10% raise
        System.out.printf("Employee1 initial yearly salary: %.2f -- +10 %% rise --> ", employee1.getMonthlySalary() * 12.0);
        employee1.setMonthlySalary(employee1.getMonthlySalary() + (employee1.getMonthlySalary() * 0.1));
        System.out.printf("%.2f.\n\n", employee1.getMonthlySalary() * 12.0);

        System.out.printf("Employee2 initial yearly salary: %.2f -- +10 %% rise --> ", employee2.getMonthlySalary() * 12.0);
        employee2.setMonthlySalary(employee2.getMonthlySalary() + (employee2.getMonthlySalary() * 0.1));
        System.out.printf("%.2f.", employee2.getMonthlySalary() * 12.0);
    }
}