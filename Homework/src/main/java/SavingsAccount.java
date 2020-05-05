//A blueprint for saving accounts.

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        if (savingsBalance >= 0) {
            this.savingsBalance = savingsBalance;
        }else {
            this.savingsBalance = 0;
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        if (annualInterestRate >= 0) {
            SavingsAccount.annualInterestRate = annualInterestRate;
        }
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance * (annualInterestRate / 12.0);
        savingsBalance += monthlyInterest;
    }
}
