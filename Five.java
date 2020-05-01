/*
application that inputs three integers from the user and displays the sum, average, product, smallest and largest of
 the numbers.
 */

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("First integer = ");
        int a = reader.nextInt();
        System.out.print("Second integer = ");
        int b = reader.nextInt();
        System.out.print("Third integer = ");
        int c = reader.nextInt();
        int sum = a + b + c;
        float avg = (float) (sum) / (float) (3);
        int prod = a * b * c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
        System.out.println("(" + a + " + " + b + " + " + c + ")/3 = " + avg);
        System.out.println(a + " * " + b + " * " + c + " = " + prod);
        if ((a > b) && (a > c)){
            System.out.println(a + " is largest.");
        }else if ((b > a) && (b > c)){
            System.out.println(b + " is largest.");
        }else{
            System.out.println(c + " is largest.");
        }
        if ((a < b) && (a < c)){
            System.out.println(a + " is smallest.");
        }else if ((b < a) && (b < c)){
            System.out.println(b + " is smallest.");
        }else{
            System.out.println(c + " is smallest.");
        }
    }
}
