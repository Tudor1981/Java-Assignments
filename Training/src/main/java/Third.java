/*
application that asks the user to enter two integers, obtains them from the user and prints their sum, product,
difference and quotient (division).
 */

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("First integer = ");
        int a = reader.nextInt();
        System.out.print("Second integer = ");
        int b = reader.nextInt();
        int sum = a + b;
        int prod = a * b;
        int diff = a - b;
        float div = (float) (a) / (float) (b);
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " / " + b + " = " + div);
    }
}