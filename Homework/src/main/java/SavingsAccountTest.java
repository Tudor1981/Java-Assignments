// testing the capabilities of Savings account

import java.util.Scanner;

public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        //displaying the initial info
        System.out.println("\nThe initial info for our 2 saving accounts is:\n");
        System.out.printf("The initial common annual interest rate is: %s", (SavingsAccount.getAnnualInterestRate() * 100.00) + "%.\n\n");

        System.out.printf("The initial balance for saver1: %.2f.\n\n", saver1.getSavingsBalance());

        System.out.printf("The initial balance for saver2: %.2f.\n\n", saver2.getSavingsBalance());

        //setting the annual interest to 4%

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("This is how the balances of the 2 accounts have changed after the annual interest change to 4% for the current month.");

        //account1
        System.out.printf("\nThe saver1 balance: %.2f ---> ", saver1.getSavingsBalance());
        saver1.calculateMonthlyInterest();
        System.out.printf("%.2f.", saver1.getSavingsBalance());

        //account2
        System.out.printf("\nThe saver2 balance: %.2f ---> ", saver2.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.printf("%.2f.\n\n", saver2.getSavingsBalance());

        //setting the annual interest to 5%

        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("This is how the balances of the 2 accounts have changed after the annual interest change to 5% for the next month.");

        //account1
        System.out.printf("\nThe saver1 balance: %.2f ---> ", saver1.getSavingsBalance());
        saver1.calculateMonthlyInterest();
        System.out.printf("%.2f.", saver1.getSavingsBalance());

        //account2
        System.out.printf("\nThe saver2 balance: %.2f ---> ", saver2.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.printf("%.2f.\n\n", saver2.getSavingsBalance());
    }
}
