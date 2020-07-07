import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //creating the list of employees and adding objects to it
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Financial"));
        employees.add(new Employee("HR"));
        employees.add(new Employee("IT"));
        employees.add(new Employee("HR"));
        employees.add(new Employee("IT"));

        //displaying all employees with name, department and salary using lambda
        employees.forEach((employee)->
                System.out.println("Name: " + employee.getName() + " Department: " + employee.getDepartment() + " Salary: " + employee.getSalary())
            );
        System.out.println();
        //saving the values of HR employees before the change
        int hrSalary1 = employees.get(1).getSalary();
        int hrSalary2 = employees.get(3).getSalary();
        //giving the HR employees a 10% rise using lambda
        employees.forEach((employee ->
        {
            if (employee.getDepartment().equals("HR")){
                employee.setSalary((int) (employee.getSalary() + (employee.getSalary() * 0.1)));
            }
        }));
        //displaying the employees from HR and how their salaries evolved
        employees.forEach((employee ->
        {
            if ((employee.getDepartment().equals("HR"))){
                if (employee.getName() == employees.get(1).getName()){
                    System.out.println("Previous salary was " + hrSalary1);
                }else {
                    System.out.println("Previous salary was " + hrSalary2);
                }
                System.out.println("Name: " + employee.getName() + " the salary rose to " + employee.getSalary());
                System.out.println();
            }
        }));
    }
}
