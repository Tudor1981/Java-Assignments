public class Car implements Info, IsStartable {

    private String model;
    private String licensePlate;

    public Car(String model, String licensePlate) {

        if (model != null && !model.isEmpty()) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
        if (licensePlate != null && !licensePlate.isEmpty()) {
            this.licensePlate = licensePlate;
        }else {
            this.licensePlate = "Unknown";
        }
    }

    @Override
    public void showInfo() {

        System.out.println("\nThe car model is: " + this.model);
        System.out.println("The car's reg plate is: " + this.licensePlate);
    }

    @Override
    public void start() {

        System.out.printf("\nThe %s car with the %s reg plate is starting its engine at the start line.\n"
            , this.model, this.licensePlate);
    }

    @Override
    public void doSomething() {

        System.out.printf("The %s car with the %s reg plate is traveling from the start line to the finish line.\n"
            , this.model, this.licensePlate);
    }

    @Override
    public void stop() {

        System.out.printf("The %s car with the %s reg plate is stopping its engine at the finish line.\n"
            , this.model, this.licensePlate);
    }
}
