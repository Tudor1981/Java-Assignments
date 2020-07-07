import org.apache.commons.lang3.RandomStringUtils;

public class Person {

    private String name;
    private Gender gender;
    private int age;
    private String email;

    public Person(Gender gender, int age) {
        this.name = RandomStringUtils.randomAlphabetic(5);
        this.gender = gender;
        this.age = age;
        this.email = RandomStringUtils.randomAlphanumeric(6);
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
