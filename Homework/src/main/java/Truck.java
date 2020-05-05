//is a child of Car

public class Truck extends Car {

    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        if (weight > 0) {
            this.weight = weight;
        }
    }

    @Override
    public double getSalePrice(){
        double price;
        if (weight > 2000){
            price = super.getSalePrice() - (super.getSalePrice() * 0.1);
        }else {
            price = super.getSalePrice() - (super.getSalePrice() * 0.2);
        }
        return price;
    }
}
