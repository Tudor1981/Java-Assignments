/*
Application that allows the user to enter up to 20 integer grades into an array. Stop the loop by typing in ‐1. Your
 main method should call an Average method that returns the average of the grades.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Twelve {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        DecimalFormat decimals = new DecimalFormat();
        decimals.setMaximumFractionDigits(2);
        int[] grades = new int[20];
        for (int i = 0; i < 20; i++){
            System.out.print("grade[" + i + "]= ");
            grades[i] = reader.nextInt();
            if (grades[i] == -1){
                grades[i] = 0;
                break;
            }
        }
        System.out.println("The average of the grades is " + decimals.format(average(grades)) + ".");
    }
    private static float average(int gr[]){

        int count = 0, sum = 0;
        float avg;
        for (int i = 0; i < 20; i++) {
            if (gr[i] > 0){
                count++;
                sum += gr[i];
            }else {
                break;
            }
        }
        avg = (float) (sum) / (float) (count);
        return avg;
    }
}
