//a child of Car

public class Ford extends Car{

    private int weight;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int weight, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        if (weight > 0) {
            this.weight = weight;
        }
        if (manufacturerDiscount > 0) {
            this.manufacturerDiscount = manufacturerDiscount;
        }
    }

    @Override
    public double getSalePrice(){
        return (super.getSalePrice() - this.manufacturerDiscount);
    }
}
