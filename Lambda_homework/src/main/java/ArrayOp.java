import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayOp {

    public static void main(String[] args) {

        //initialising the array
        int[] arr = {2, 14, 15, 22, 25};
        //the lambda expression for printing
        Printing p = (int q) -> System.out.println(q);
        for (int i = 0; i < 5; i++){
            System.out.print("arr["+i+"]=");
            p.print(arr[i]);
        }

        //using lambda expression to asses if an integer is even(built in interface)
        Function<Integer, Boolean> asses = (Integer x)->x % 2 == 0;
        System.out.println("\nThe even numbers in our array are:");
        for (int i = 0; i < 5; i++){
            if (asses.apply(arr[i])){
                System.out.println(arr[i]);
            }
        }
        //using lambda expression to asses if an integer is even(custom interface)
        Assesor assesor = (int x)->x % 2 == 0;
        System.out.println("\nThe even numbers in our array are:");
        for (int i = 0; i < 5; i++){
            if (assesor.isEven(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
