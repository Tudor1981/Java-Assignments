//Employee blueprint with some functionalities

import java.text.DecimalFormat;

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
        DecimalFormat myFormatter = new DecimalFormat("0.00");
        String result;
        result = "First name: " + this.getFirstName() + "; \n";
        result += "Last name: " + this.getLastName() + "; \n";
        result += "Monthly salary: " + myFormatter.format(this.getMonthlySalary()) + ".";
        return result;
    }
}
