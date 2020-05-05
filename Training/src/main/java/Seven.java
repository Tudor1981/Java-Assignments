/*
application that inputs a series of 10 integers and determines and prints the largest integer.
 */

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] s = new int[10];
        int largest = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("s[" + i + "]= ");
            s[i] = reader.nextInt();
            if (i == 0){
                largest = s[i];
            }
            if (largest < s[i]){
                largest = s[i];
            }
        }
        System.out.println("The largest number in the array is " + largest);
    }
}
