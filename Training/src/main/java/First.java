/*
program that calculates and prints the product of three integers read from the command line terminal
 */

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("First number =");
        int a = reader.nextInt();
        System.out.print("Second number =");
        int b = reader.nextInt();
        System.out.print("Third number =");
        int c = reader.nextInt();
        int prod = a * b * c;
        System.out.print(prod);
    }
}
