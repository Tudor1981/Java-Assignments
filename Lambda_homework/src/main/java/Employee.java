import org.apache.commons.lang3.RandomStringUtils;

public class Employee {

    private String name;
    private String department;
    private int salary;

    public Employee(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        }else {
            System.out.println("No valid department in the input!");
        }
        name = RandomStringUtils.randomAlphabetic(7);
        salary = Integer.parseInt(RandomStringUtils.randomNumeric(4));
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
