import java.awt.*;

public class Car1 extends Vehicle {

    private int topSpeed;
    private Transmission transmission;
    private CarShape shape;

    public Car1() {

        this.topSpeed = 0;
        this.transmission = Transmission.Automatic;//automatic by default
        this.shape = CarShape.Sedan;//sedan by default
    }

    public Car1(String brand, String model, int price, int topSpeed, Transmission transmission, CarShape shape) {
        super(brand, model, price);
        if (topSpeed > 0) {
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed = 0;
        }
        if (transmission instanceof Transmission) {
            this.transmission = transmission;
        }else {
            this.transmission = Transmission.Automatic;//give it the default
        }
        if (shape instanceof CarShape) {
            this.shape = shape;
        }else {
            this.shape = CarShape.Sedan;//give it the default
        }
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0) {
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed = 0;
        }
    }

    public void setTransmission(Transmission transmission) {
        if (transmission instanceof Transmission) {
            this.transmission = transmission;
        }else {
            this.transmission = Transmission.Automatic;//give it the default
        }
    }

    public void setShape(CarShape shape) {
        if (shape instanceof CarShape) {
            this.shape = shape;
        }else {
            this.shape = CarShape.Sedan;//give it the default
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public CarShape getShape() {
        return shape;
    }

    @Override
    public String toString(){
        String result;
        result = "\nThe car has the following characteristics:\n";
        result += "Brand: " + super.getBrand() + " Model: " + super.getModel() + " Price: " + super.getPrice() + "\n";
        result += "Shape: " + this.shape + " Transmission: " + this.transmission + " Top speed: " + this.topSpeed + "\n";
        return result;
    }
}
