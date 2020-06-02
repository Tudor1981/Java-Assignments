public class Motorcycle extends Vehicle {

    private int topSpeed;
    private MotorcycleShape shape;

    public Motorcycle() {

        this.topSpeed = 0;
        this.shape = MotorcycleShape.Chopper;//this is the default value
    }

    public Motorcycle(String brand, String model, int price, int topSpeed, MotorcycleShape shape) {
        super(brand, model, price);
        if (topSpeed > 0) {
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed = 0;
        }
        if (shape instanceof MotorcycleShape) {
            this.shape = shape;
        }else {
            this.shape = MotorcycleShape.Chopper;//give it the default value
        }
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0) {
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed = 0;
        }
    }

    public void setShape(MotorcycleShape shape) {
        if (shape instanceof MotorcycleShape) {
            this.shape = shape;
        }else {
            this.shape = MotorcycleShape.Chopper;//give it the default value
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public MotorcycleShape getShape() {
        return shape;
    }

    @Override
    public String toString(){
        String result;
        result = "\nThe motorcycle has the following characteristics:\n";
        result += "Brand: " + super.getBrand() + " Model: " + super.getModel() + " Price: " + super.getPrice() + "\n";
        result += "Shape: " + this.shape + " Top speed: " + this.topSpeed + "\n";
        return result;
    }
}
