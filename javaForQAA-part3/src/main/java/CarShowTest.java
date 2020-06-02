import java.util.Scanner;

public class CarShowTest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //performing the requested operations for the Person class
        System.out.print("\nInput the name of the first participant: ");
        String name = reader.nextLine();
        System.out.print("Input the CNP of the first participant: ");
        String CNP = reader.nextLine();
        Person person1 = new Person(name, CNP);
        System.out.print("Input the name of the second participant: ");
        name = reader.nextLine();
        System.out.print("Input the CNP of the second participant: ");
        CNP = reader.nextLine();
        Person person2 = new Person(name, CNP);

        System.out.println("\nPerson 1");
        person1.showInfo();
        System.out.println("\nPerson 2");
        person2.showInfo();

        //performing the requested operations for the Camera class
        System.out.print("\nInput the model of the first camera: ");
        String model = reader.nextLine();
        System.out.print("Input the serial number of the first camera: ");
        String serialNumber = reader.nextLine();
        Camera camera1 = new Camera(model, serialNumber);
        System.out.print("\nInput the model of the second camera: ");
        model = reader.nextLine();
        System.out.print("Input the serial number of the second camera: ");
        serialNumber = reader.nextLine();
        Camera camera2 = new Camera(model, serialNumber);

        System.out.println("\nCamera 1");
        camera1.showInfo();
        camera1.start();
        camera1.doSomething();
        camera1.stop();
        System.out.println("\nCamera 2");
        camera2.showInfo();

        //performing the requested operations for the Car class
        System.out.print("\nInput the model for the first car: ");
        model = reader.nextLine();
        System.out.print("Input the license plate number for the first car: ");
        String licensePlate = reader.nextLine();
        Car car1 = new Car(model, licensePlate);
        System.out.print("\nInput the model for the second car: ");
        model = reader.nextLine();
        System.out.print("Input the license plate number for the second car: ");
        licensePlate = reader.nextLine();
        Car car2 = new Car(model, licensePlate);

        System.out.println("\nCar 1");
        car1.showInfo();
        car1.start();
        car1.doSomething();
        car1.stop();
        System.out.println("\nCar 2");
        car2.showInfo();
    }
}
