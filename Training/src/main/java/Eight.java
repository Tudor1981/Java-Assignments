/*
Write a Java application that uses looping to print the following table of values
 */

public class Eight {

    public static void main(String[] args) {

        System.out.println("N    10*N    100*N    1000*N");
        System.out.println();
        for (int i = 1; i < 6; i++){
            System.out.println(i + "    " + (10 * i) + "    " + (100 * i) + "    " + (1000 * i));
        }
    }
}
