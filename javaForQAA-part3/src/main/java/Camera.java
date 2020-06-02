public class Camera implements Info, IsStartable {

    private String model;
    private String serialNumber;

    public Camera(String model, String serialNumber) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
        if (serialNumber != null && !serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        }else {
            this.serialNumber = "Unknown";
        }
    }

    @Override
    public void showInfo() {

        System.out.println("\nThe camera's model is: " + this.model);
        System.out.println("The camera's serial number is: " + this.serialNumber);
    }

    @Override
    public void start() {

        System.out.printf("The %s camera having the %s serial number is being taken out of its cover and getting initialized.\n",
             this.model, this.serialNumber);
    }

    @Override public void doSomething() {

        System.out.printf("The %s camera having the %s serial number is taking photos.\n",
            this.model, this.serialNumber);
    }

    @Override public void stop() {

        System.out.printf("The %s camera having the %s serial number is getting turned off and being put back in its cover.\n",
            this.model, this.serialNumber);
    }
}
