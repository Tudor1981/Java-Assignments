/*
application that reads two integers, determines whether the first is a multiple of the second and print the result.
 */

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("First integer = ");
        int a = reader.nextInt();
        System.out.print("Second integer = ");
        int b = reader.nextInt();
        if ((a % b) == 0){
            System.out.println(a + " is a multiple of " + b + ". " + a + " / " + b + " = " + (a / b));
        }else{
            System.out.println(a + " is not a multiple of " + b + ".");
        }
    }
}
