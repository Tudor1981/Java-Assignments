/*
One dimensional array operations:
•	Set the 10 elements of integer array counts to zero
•	Add one to each of the 15 elements of integer array bonus and display them in a row
•	Display the five values of integer array bestScores in column format
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {

        int[] counts = new int[10];
        for (int i = 0; i < 10; i++){
            counts[i] = 0;
        }
        System.out.println(Arrays.toString(counts));

        int[] bonus = {23, 56, 12, 2, 54, 6, 6, 89, 20, 4, 15, 45, 78, 34, 22};
        for (int j = 0; j < 15; j++){
            bonus[j] = bonus[j] + 1;
        }
        System.out.println(Arrays.toString(bonus));

        int[] bestScores = {15, 31, 56, 5, 12};
        for (int k = 0; k < 5; k++){
            System.out.println(bestScores[k]);
        }
    }
}
