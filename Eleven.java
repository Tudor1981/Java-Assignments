/*
program that reads a string from the keyboard, and outputs the string twice in a row, first all uppercase and next all
 lowercase
 */

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("The word/sentence = ");
        String wor = reader.next();
        System.out.print(wor.toUpperCase() + wor.toLowerCase());
    }
}
