//a child of car

public class Sedan extends Car{

    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public double getSalePrice(){
        double price;
        if (length > 20){
            price = super.getSalePrice() - (super.getSalePrice() * 0.05);
        }else {
            price = super.getSalePrice() - (super.getSalePrice() * 0.1);
        }
        return price;
    }
}
