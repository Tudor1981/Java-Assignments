import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void vehiclesCleanup(){
        final String filename = "c:\\Users\\P3701231\\IdeaProjects\\javaForQAA-part3\\src\\main\\resources\\vehicles.txt";
        final String tempFilename = "c:\\Users\\P3701231\\IdeaProjects\\javaForQAA-part3\\src\\main\\resources\\vehiclesTmp.txt";
        try {
            File file = new File(filename);
            File tempFile = new File(tempFilename);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(tempFile);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] lineComponents = line.split(", ");
                if (lineComponents[0].equals("Car") || lineComponents[0].equals("Motorcycle") || lineComponents[0].equals("Bicycle")){
                    fileWriter.write(line + "\n");
                }
            }
            fileWriter.close();
            fileReader.close();
            file.delete();
            tempFile.renameTo(file);
            RandomAccessFile file1 = new RandomAccessFile(filename, "rw");
            file1.setLength(file1.length() - 1);
            file1.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  static void readFileAndConvertToObjects(String filename, List vehicles){
        try {
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            while (line != null){
                vehicles.add(convertLineToVehicle(line));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static Vehicle convertLineToVehicle(String line){

        String[] splitLine = line.split(", ");
        Vehicle veh;
        if (splitLine[0].contains("Car")){
            veh = convertLineToCar(splitLine);
        }else if (splitLine[0].contains("Motorcycle")){
            veh = convertLineToMotorcycle(splitLine);
        }else if (splitLine[0].contains("Bicycle")){
            veh = convertLineToBicycle(splitLine);
        }else {
            veh = new Vehicle();
        }
        return veh;
    }

    private static Car1 convertLineToCar(String[] tokens){

    //String brand, String model, int price, int topSpeed, Transmission transmission, CarShape shape
        Car1 processedCar;
        int price = Integer.parseInt(tokens[3]);
        int topSpeed = Integer.parseInt(tokens[4]);
        Transmission transmission = Transmission.valueOf(tokens[5]);
        CarShape shape = CarShape.valueOf(tokens[6]);
        processedCar = new Car1(tokens[1], tokens[2], price, topSpeed, transmission, shape);
        //System.out.println("Method convert line to car invoked");
        return processedCar;
    }

    private static Motorcycle convertLineToMotorcycle(String[] tokens){

        //String brand, String model, int price, int topSpeed, MotorcycleShape shape
        Motorcycle processedMotorcycle;
        int price = Integer.parseInt(tokens[3]);
        int topSpeed = Integer.parseInt(tokens[4]);
        MotorcycleShape shape = MotorcycleShape.valueOf(tokens[5]);
        processedMotorcycle = new Motorcycle(tokens[1], tokens[2], price, topSpeed, shape);
        return processedMotorcycle;
    }

    private static Bicycle convertLineToBicycle(String[] tokens){

        //String brand, String model, int price, int maxNoOfGears
        Bicycle processedBicycle;
        int price = Integer.parseInt(tokens[3]);
        int maxNoOfGears = Integer.parseInt(tokens[4]);
        processedBicycle = new Bicycle(tokens[1], tokens[2], price, maxNoOfGears);
        return processedBicycle;
    }
}
