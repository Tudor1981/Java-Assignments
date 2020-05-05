//testing the functionality

public class MyOwnAutoShop {

    public static void main(String[] args) {

        //a)
        Truck truck1 = new Truck(60, 7895.12, "Green", 3000);
        Truck truck2 = new Truck(55, 9545.77, "Yellow", 1500);

        //b)
        Ford ford1 = new Ford(122, 5245.89, "Purple", 2753, 300);

        //c)
        Sedan sedan1 = new Sedan(77, 7854.12, "Red", 25);
        Sedan sedan2 = new Sedan(145, 3654.39, "Violet", 11);

        //d)
        Car car = new Car(88, 1212.11, "Blue");

        //e) displaying the sale price for all objects
        System.out.println("\nThe trucks have the following prices:");
        System.out.printf("Truck1 price: %.2f.\n", truck1.getSalePrice());
        System.out.printf("Truck2 price: %.2f.\n\n", truck2.getSalePrice());

        System.out.println("The Ford vehicle has the following price:");
        System.out.printf("Ford1 price: %.2f.\n\n", ford1.getSalePrice());

        System.out.println("The sedans have the following prices:");
        System.out.printf("Sedan1 price: %.2f.\n", sedan1.getSalePrice());
        System.out.printf("Sedan2 price: %.2f.\n\n", sedan2.getSalePrice());

        System.out.println("The generic car has the following price:");
        System.out.printf("Car price: %.2f.\n", car.getSalePrice());
    }
}
