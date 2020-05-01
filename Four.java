/*
application that asks the user to enter two integers, obtains them from the user and displays the larger number
followed by the words “is larger”. If the numbers are equal, print “These numbers are equal”.
 */

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("First integer = ");
        int a = reader.nextInt();
        System.out.print("Second integer = ");
        int b = reader.nextInt();
        if (a > b){
            System.out.println(a + " is larger.");
        }else if (a == b){
            System.out.println("The numbers are equal.");
        }else{
            System.out.println(b + " is larger.");
        }
    }
}
