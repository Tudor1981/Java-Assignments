//Employee blueprint with some functionalities

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String initFirstName, String initLastName, double initMonthlySalary){
        if (initFirstName != null && !initFirstName.isEmpty()){
            firstName = initFirstName;
        }else {
            firstName = "Unknown";
        }
        if (initLastName != null && !initLastName.isEmpty()){
            lastName = initLastName;
        }else {
            lastName = "Unknown";
        }
        if (initMonthlySalary > 0){
            monthlySalary = initMonthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }else {
            this.firstName = "Unknown";
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }else {
            this.lastName = "Unknown";
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }else {
            this.monthlySalary = 0.0;
        }
    }

    @Override
    public String toString(){
        String result;
        result = "first name: " + this.getFirstName() + "; \n";
        result += "last name: " + this.getLastName() + "; \n";
        result += "quantity: " + this.getMonthlySalary() + ".";
        return result;
    }
}
