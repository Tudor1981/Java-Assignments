/*
application to prompt the user for the double radius of a sphere, and call method sphereVolume to calculate and display
 the volume of the sphere.
 */

import java.util.Scanner;

public class Nine {

    private static double sphereVolume(double rad){

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(rad, 3);
        return volume;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("The sphere radius = ");
        double radius = reader.nextDouble();
        System.out.println("The volume of the sphere with the " + radius + " radius is " + sphereVolume(radius) + ".");
    }
}
