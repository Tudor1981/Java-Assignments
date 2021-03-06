import org.apache.commons.math.random.RandomDataImpl;

public class Course {

    private int id;
    private String name;

    public Course() {

        RandomDataImpl randomData = new RandomDataImpl();
        int randomId = randomData.nextInt(0, 1000000);
        this.id = randomId;
        this.name = "Unknown";
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }else {
            this.id = 0;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }else {
            this.name = "unknown";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
