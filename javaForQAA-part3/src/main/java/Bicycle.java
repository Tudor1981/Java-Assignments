public class Bicycle extends Vehicle{

    private int maxNoOfGears;

    public Bicycle() {

        this.maxNoOfGears = 0;
    }

    public Bicycle(String brand, String model, int price, int maxNoOfGears) {
        super(brand, model, price);
        if (maxNoOfGears > 0) {
            this.maxNoOfGears = maxNoOfGears;
        }else {
            this.maxNoOfGears = 0;
        }
    }

    public void setMaxNoOfGears(int maxNoOfGears) {
        if (maxNoOfGears > 0) {
            this.maxNoOfGears = maxNoOfGears;
        }else {
            this.maxNoOfGears = 0;
        }
    }

    public int getMaxNoOfGears() {
        return maxNoOfGears;
    }

    @Override
    public String toString(){
        String result;
        result = "\nThe bicycle has the following characteristics:\n";
        result += "Brand: " + super.getBrand() + " Model: " + super.getModel() + " Price: " + super.getPrice() + "\n";
        result += "Maximum number of gears: " + this.maxNoOfGears + "\n";
        return result;
    }
}
