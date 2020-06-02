public class Vehicle {

    private String brand;
    private String model;
    private int price;

    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0;
    }

    public Vehicle(String brand, String model, int price) {

        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }else {
            this.brand = "Unknown";
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
        if (price > 0) {
            this.price = price;
        }else {
            this.price = 0;
        }
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }else {
            this.brand = "Unknown";
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }else {
            this.price = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        String result;
        result = "\nVehicle brand: " + this.brand;
        result += "\nVehicle model: " + this.model;
        result += "\nVehicle price: " + this.price + "\n";
        return result;
    }
}
