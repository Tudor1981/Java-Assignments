//the parent class for all types of cars

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        if (speed > 0) {
            this.speed = speed;
        }
        if (regularPrice > 0) {
            this.regularPrice = regularPrice;
        }
        if (color != null && !color.isEmpty()) {
            this.color = color;
        }else {
            this.color = "Unknown";
        }
    }

    public double getSalePrice(){
        return regularPrice;
    }
}
