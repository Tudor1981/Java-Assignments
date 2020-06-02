import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiclesProcessor {

    private static List<Vehicle> vehicles = new ArrayList<Vehicle>();

    private static List<Car1> cars = new ArrayList<Car1>();

    private static List<Motorcycle> motorcycles = new ArrayList<Motorcycle>();

    private static List<Bicycle> bicycles = new ArrayList<Bicycle>();

    public static void countAndPrintVehiclesByType(List<Vehicle> vehicles) {
        int noVehicles;
        int noCars = 0;
        int noMotorcycles = 0;
        int noBicycles = 0;
        //cleanup of the list
        for (int i = 0; i < vehicles.size(); i++) {
            if (!(vehicles.get(i) instanceof Car1) && !(vehicles.get(i) instanceof Motorcycle) && !(vehicles.get(i) instanceof Bicycle)) {
                vehicles.remove(i);
            }
        }
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle tmpVehicle = vehicles.get(i);
            if (tmpVehicle instanceof Car1) {
                cars.add((Car1) tmpVehicle);
                noCars += 1;
            } else if (tmpVehicle instanceof Motorcycle) {
                motorcycles.add((Motorcycle) tmpVehicle);
                noMotorcycles += 1;
            } else if (tmpVehicle instanceof Bicycle) {
                bicycles.add((Bicycle) tmpVehicle);
                noBicycles += 1;
            } else {
                vehicles.remove(tmpVehicle);
            }
        }
        noVehicles = noCars + noMotorcycles + noBicycles;
        System.out.println("We have " + noVehicles + " vehicles out of which:");
        System.out.println("- " + noCars + " are cars as follows:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
        System.out.println("- " + noMotorcycles + " are motorcycles as follows:");
        for (int i = 0; i < motorcycles.size(); i++) {
            System.out.println(motorcycles.get(i).toString());
        }
        System.out.println("- " + noBicycles + " are bicycles as follows:");
        for (int i = 0; i < bicycles.size(); i++) {
            System.out.println(bicycles.get(i).toString());
        }
    }

    private static void displayVehiclesInDifferentFiles() {

        File fileCars = new File("c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//cars.txt");
        File fileMotorcycles = new File("c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//motorcycles.txt");
        File fileBicycles = new File("c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//bicycles.txt");
        try {
            fileCars.createNewFile();
            FileWriter carsWriter = new FileWriter(fileCars);
            for (int i = 0; i < cars.size(); i++) {
                carsWriter.write(
                    cars.get(i).getBrand() + ", " + cars.get(i).getModel() + ", " + cars.get(i).getPrice() + ", " + cars.get(i).getTopSpeed() + ", " + cars.get(i).getTransmission() + ", " + cars
                        .get(i).getShape() + "\n");
            }
            carsWriter.close();
            fileMotorcycles.createNewFile();
            FileWriter motorcycleWriter = new FileWriter(fileMotorcycles);
            for (int i = 0; i < motorcycles.size(); i++) {
                motorcycleWriter.write(
                    motorcycles.get(i).getBrand() + ", " + motorcycles.get(i).getModel() + ", " + motorcycles.get(i).getPrice() + ", " + motorcycles.get(i).getTopSpeed() + ", " + motorcycles.get(i)
                        .getShape() + "\n");
            }
            motorcycleWriter.close();
            fileBicycles.createNewFile();
            FileWriter bicycleWriter = new FileWriter(fileBicycles);
            for (int i = 0; i < bicycles.size(); i++) {
                bicycleWriter.write(bicycles.get(i).getBrand() + ", " + bicycles.get(i).getModel() + ", " + bicycles.get(i).getPrice() + ", " + bicycles.get(i).getMaxNoOfGears() + "\n");
            }
            bicycleWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void removeVehiclesFromOriginalFilesByBrand() {
        boolean checkerVehicleType = true;
        boolean checkerBrand = true;
        boolean isCar = false;
        boolean isMotorcycle = false;
        boolean isBicycle = false;
        String vehicleType = "";
        String brand = "";
        Scanner reader = new Scanner(System.in);
        while (checkerVehicleType) {
            System.out.print("Which type of vehicle do you want to remove?(car, motorcycle, bicycle)\n~");
            vehicleType = reader.nextLine();
            if (vehicleType.equals("car")) {
                isCar = true;
                checkerVehicleType = false;
                while (checkerBrand) {
                    System.out.print("What brand of car do you want to remove?\n~");
                    brand = reader.nextLine();
                    for (Car1 car : cars) {
                        if (car.getBrand().equals(brand)) {
                            checkerBrand = false;
                            break;
                        }
                    }
                    System.out.print("Wrong brand. Please try again.");
                }
            } else if (vehicleType.equals("motorcycle")) {
                isMotorcycle = true;
                checkerVehicleType = false;
                while (checkerBrand) {
                    System.out.print("What brand of motorcycle do you want to remove?\n~");
                    brand = reader.nextLine();
                    for (int i = 0; i < motorcycles.size(); i++) {
                        if (motorcycles.get(i).getBrand().equals(brand)) {
                            checkerBrand = false;
                            break;
                        }
                    }
                    if(checkerBrand) {
                        System.out.print("Wrong brand. Please try again.");
                    }
                }
            } else if (vehicleType.equals("bicycle")) {
                isBicycle = true;
                checkerVehicleType = false;
                while (checkerBrand) {
                    System.out.print("What brand of bicycle do you want to remove?\n~");
                    brand = reader.nextLine();
                    for (int i = 0; i < bicycles.size(); i++) {
                        if (bicycles.get(i).getBrand().equals(brand)) {
                            checkerBrand = false;
                            break;
                        }
                    }
                    System.out.print("Wrong brand. Please try again.");
                }
            } else {
                System.out.print("Wrong vehicle type. Please try again.");
            }
        }


        System.out.println(vehicleType);
        System.out.println(brand);

        final String VEHICLES_FILE_ROOT_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//vehicles";
        final String CARS_FILE_ROOT_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//cars";
        final String MOTORS_FILE_ROOT_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//motorcycles";
        final String BIKES_FILE_ROOT_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//bicycles";

        final String VEHICLES_FILE_BKP_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//bkp//vehicles";
        final String CARS_FILE_BKP_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//bkp//cars";
        final String MOTORS_FILE_BKP_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//bkp//motorcycles";
        final String BIKES_FILE_BKP_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//bkp//bicycles";

        File vehiclesBKP = new File(VEHICLES_FILE_BKP_PATH + ".txt");
        File carsBKP = new File(CARS_FILE_BKP_PATH + ".txt");
        File motorcyclesBKP = new File(MOTORS_FILE_BKP_PATH + ".txt");
        File bicyclesBKP = new File(BIKES_FILE_BKP_PATH + ".txt");

        File vehiclesFile = new File(VEHICLES_FILE_ROOT_PATH + ".txt");
        File carsFile = new File(CARS_FILE_ROOT_PATH + ".txt");
        File motorcyclesFile = new File(MOTORS_FILE_ROOT_PATH + ".txt");
        File bicyclesFile = new File(BIKES_FILE_ROOT_PATH + ".txt");

        File tmpVehiclesFile = new File(VEHICLES_FILE_ROOT_PATH + "Tmp.txt");
        File tmpCarsFile = new File(CARS_FILE_ROOT_PATH + "Tmp.txt");
        File tmpMotorcyclesFile = new File(MOTORS_FILE_ROOT_PATH + "Tmp.txt");
        File tmpBicyclesFile = new File(BIKES_FILE_ROOT_PATH + "Tmp.txt");
        try {
            FileReader vehiclesFileReader = new FileReader(vehiclesFile);
            BufferedReader vehiclesBR = new BufferedReader(vehiclesFileReader);
            FileWriter vehiclesFileWriter = new FileWriter(tmpVehiclesFile);
            String line;
            while ((line = vehiclesBR.readLine()) != null) {
                if (line.contains(brand)) {
                    continue;
                } else {
                    vehiclesFileWriter.write(line + "\n");
                }
            }
            vehiclesFileReader.close();
            vehiclesFileWriter.close();
            vehiclesFile.renameTo(vehiclesBKP);
            vehiclesFile.delete();
            tmpVehiclesFile.renameTo(vehiclesFile);
            if (isCar) {
                FileReader carsFileReader = new FileReader(carsFile);
                BufferedReader carsBR = new BufferedReader(carsFileReader);
                FileWriter carsFileWriter = new FileWriter(tmpCarsFile);
                while ((line = carsBR.readLine()) != null) {
                    if (line.contains(brand)) {
                        continue;
                    } else {
                        carsFileWriter.write(line + "\n");
                    }
                }
                carsFileReader.close();
                carsFileWriter.close();
                carsFile.renameTo(carsBKP);
                carsFile.delete();
                tmpCarsFile.renameTo(carsFile);
            } else if (isMotorcycle) {
                FileReader motorcyclesFileReader = new FileReader(motorcyclesFile);
                BufferedReader motorcyclesBR = new BufferedReader(motorcyclesFileReader);
                FileWriter motorcyclesFileWriter = new FileWriter(tmpMotorcyclesFile);
                while ((line = motorcyclesBR.readLine()) != null) {
                    if (line.contains(brand)) {
                        continue;
                    } else {
                        motorcyclesFileWriter.write(line + "\n");
                    }
                }
                motorcyclesFileReader.close();
                motorcyclesFileWriter.close();
                motorcyclesFile.renameTo(motorcyclesBKP);
                motorcyclesFile.delete();
                tmpMotorcyclesFile.renameTo(motorcyclesFile);
            } else if (isBicycle) {
                FileReader bicyclesFileReader = new FileReader(bicyclesFile);
                BufferedReader bicyclesBR = new BufferedReader(bicyclesFileReader);
                FileWriter bicyclesFileWriter = new FileWriter(tmpBicyclesFile);
                while ((line = bicyclesBR.readLine()) != null) {
                    if (line.contains(brand)) {
                        continue;
                    } else {
                        bicyclesFileWriter.write(line + "\n");
                    }
                }
                bicyclesFileReader.close();
                bicyclesFileWriter.close();
                bicyclesFile.renameTo(bicyclesBKP);
                bicyclesFile.delete();
                tmpBicyclesFile.renameTo(bicyclesFile);
            } else {
                System.out.println("Some weird error occurred.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Utils.vehiclesCleanup();
        Scanner reader = new Scanner(System.in);
        //check if the vehicles list is populated
        Utils.readFileAndConvertToObjects("c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//vehicles.txt", vehicles);
        for (int i = 0; i < vehicles.size(); i++){
            System.out.println(vehicles.get(i).toString());
        }
        //checking if the cars, motorcycles and bicycles lists are populated
        countAndPrintVehiclesByType(vehicles);
        //we are putting different vehicles in different files
        displayVehiclesInDifferentFiles();
        //display the contents of the 3 new files: cars, motorcycles, bicycles
        final String ROOT_PATH = "c://Users//P3701231//IdeaProjects//javaForQAA-part3//src//main//resources//";
        final String CARS_FILE = ROOT_PATH + "cars.txt";
        final String MOTORS_FILE = ROOT_PATH + "motorcycles.txt";
        final String BIKES_FILE = ROOT_PATH + "bicycles.txt";

        File carsFile = new File(CARS_FILE);
        File motorcyclesFile = new File(MOTORS_FILE);
        File bicyclesFile = new File(BIKES_FILE);
        try{
            FileReader carsFileReader = new FileReader(carsFile);
            FileReader motorcyclesFileReader = new FileReader(motorcyclesFile);
            FileReader bicyclesFileReader = new FileReader(bicyclesFile);

            String line;

            BufferedReader carsBR = new BufferedReader(carsFileReader);
            System.out.println("\nThe cars.txt file has the following contents:" + "\n");
            while ((line = carsBR.readLine()) != null){
                System.out.println(line);
            }
            carsFileReader.close();

            BufferedReader motorcyclesBR = new BufferedReader(motorcyclesFileReader);
            System.out.println("\nThe motorcycles.txt file has the following contents:" + "\n");
            while ((line = motorcyclesBR.readLine()) != null){
                System.out.println(line);
            }
            motorcyclesFileReader.close();

            BufferedReader bicyclesBR = new BufferedReader(bicyclesFileReader);
            System.out.println("\nThe bicycles.txt file has the following contents:" + "\n");
            while ((line = bicyclesBR.readLine()) != null){
                System.out.println(line);
            }
            bicyclesFileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        //removing a brand of a vehicle from corresponding files
        System.out.println("\nWe are about to modify some files.\n");
        removeVehiclesFromOriginalFilesByBrand();
        //lets display what files were modified and what modified in them
        final String VEHICLE_FILE = ROOT_PATH + "vehicles.txt";
        final String VEHICLE_OLD_FILE = ROOT_PATH + "bkp//vehicles.txt";
        final String CARS_OLD_FILE = ROOT_PATH + "bkp//cars.txt";
        final String MOTORCYCLES_OLD_FILE = ROOT_PATH + "bkp//motorcycles.txt";
        final String BICYCLES_OLD_FILE = ROOT_PATH + "bkp//bicycles.txt";
        try {
            String vehiclesContents = new String(Files.readAllBytes(Paths.get(VEHICLE_FILE)));
            String vehiclesOldContents = new String(Files.readAllBytes(Paths.get(VEHICLE_OLD_FILE)));
            System.out.printf("\nThis is how the vehicles.txt was modified:\n\nOld contents:\n %s \n\nNew contents:\n %s", vehiclesOldContents, vehiclesContents);
            if (carsFile.lastModified() > motorcyclesFile.lastModified() && carsFile.lastModified() > bicyclesFile.lastModified()){
                String carsContents = new String(Files.readAllBytes(Paths.get(CARS_FILE)));
                String carsOldContents = new String(Files.readAllBytes(Paths.get(CARS_OLD_FILE)));
                System.out.printf("\nThis is how the cars.txt was modified:\n\nOld contents:\n %s \n\nNew contents:\n %s", carsOldContents, carsContents);
            }else if (motorcyclesFile.lastModified() > carsFile.lastModified() && motorcyclesFile.lastModified() > bicyclesFile.lastModified()){
                String motorcyclesContents = new String(Files.readAllBytes(Paths.get(MOTORS_FILE)));
                String motorcyclesOldContents = new String(Files.readAllBytes(Paths.get(MOTORCYCLES_OLD_FILE)));
                System.out.printf("\nThis is how the motorcycles.txt was modified:\n\nOld contents:\n %s \n\nNew contents:\n %s", motorcyclesOldContents, motorcyclesContents);
            }else if (bicyclesFile.lastModified() > carsFile.lastModified() && bicyclesFile.lastModified() > motorcyclesFile.lastModified()){
                String bicyclesContents = new String(Files.readAllBytes(Paths.get(BIKES_FILE)));
                String bicyclesOldContents = new String(Files.readAllBytes(Paths.get(BICYCLES_OLD_FILE)));
                System.out.printf("\nThis is how the bicycles.txt was modified:\n\nOld contents:\n %s \n\nNew contents:\n %s", bicyclesOldContents, bicyclesContents);
            }else {
                System.out.println("No file was modified");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
