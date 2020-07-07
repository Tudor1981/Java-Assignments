import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class PersonTest {
    public static void main(String[] args) {
        //creating and list and adding 4 objects to it
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(Gender.FEMALE,19));
        persons.add(new Person(Gender.MALE, 20));
        persons.add(new Person(Gender.FEMALE, 84));
        persons.add(new Person(Gender.MALE, 22));

        //using lambda function to validate the required fields from our objects
        BiFunction<Gender, Integer, Boolean> validator = (Gender g, Integer a)->(g == Gender.MALE) && (a >= 18 && a <=25);
        for (Person p : persons){
            if (validator.apply(p.getGender(), p.getAge())){
                System.out.println("Email: " + p.getEmail());
            }
        }
    }
}
