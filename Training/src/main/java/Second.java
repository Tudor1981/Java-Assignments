/*
Write a program that converts a Fahrenheit degree to Celsius
 */

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Temp in Fahrenheit = ");
        int fah = reader.nextInt();
        float celsius = (float) (5.0/9.0 * (fah - 32));
        System.out.print(celsius);
    }
}
