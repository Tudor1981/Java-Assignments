public class Person implements Info {

    private String name;
    private String CNP;

    public Person(String name, String CNP) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }else {
            this.name = "Unknown";
        }
        if (CNP != null && !CNP.isEmpty()) {
            this.CNP = CNP;
        }else {
            this.CNP = "Unknown";
        }
    }

    @Override
    public void showInfo() {

        System.out.println("The person's name is: " + name);
        System.out.println("The person's CNP is: " + CNP);
    }
}
