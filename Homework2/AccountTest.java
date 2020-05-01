// filename: AccountTest.java
// AccountTest class with the main() method

import java.util.Scanner;

public class AccountTest {
    public static void main (String args[]){
        Account account1 = new Account (50.00);
        Account account2 = new Account (-7.53);
        System.out.printf("Account1 Balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 Balance: $%.2f\n\n", account2.getBalance());

        Scanner input = new Scanner( System.in );
        double depositAmount;
        double debitAmount;

        System.out.print( "Enter deposit amount for account1: " ); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
        account1.credit( depositAmount ); // add to account1 balance

// display balances
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );

        System.out.print( "Enter deposit amount for account2: " ); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\nAdding %.2f to account2 balance\n\n", depositAmount );
        account2.credit( depositAmount ); // add to account2 balance

// display balances
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );

        System.out.print( "Enter debit amount for account1: " );
        debitAmount = input.nextDouble();
        System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );

// add testing section for ‘debit’ method (account1) and display both balances
        System.out.printf("The balance before the subtraction from account1 was %.2f.\n", account1.getBalance());
        account1.debit(debitAmount);
        System.out.printf("The balance after the subtraction from account1 is %.2f.\n", account1.getBalance());
        System.out.printf("The account2 balance shouldn't be modified and is %.2f.\n\n", account2.getBalance());

        System.out.print( "Enter debit amount for account2: " );
        debitAmount = input.nextDouble();
        System.out.printf( "\nSubtracting %.2f from account2 balance\n\n", debitAmount );

// add testing section for ‘debit’ method (account2) and display both balances
        System.out.printf("The balance before the subtraction from account2 was %.2f.\n", account2.getBalance());
        account2.debit(debitAmount);
        System.out.printf("The account1 balance shouldn't be modified and is %.2f.\n", account1.getBalance());
        System.out.printf("The balance after the subtraction from account2 is %.2f.\n", account2.getBalance());
    }
}
