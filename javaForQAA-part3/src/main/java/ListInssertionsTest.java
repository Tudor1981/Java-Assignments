import java.util.Scanner;

public class ListInssertionsTest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("How many elements do you wish to insert = ");
        int n =reader.nextInt();

        //we are filling our lists with n elements
        ListInssertions obj1 = new ListInssertions(n);

        //checking the time it take to insert an element on position 0 for the array list
        long time1 = System.currentTimeMillis();
        obj1.addArrayList(0, "something");
        long time2 = System.currentTimeMillis();
        System.out.printf("It took %d milliseconds to insert an element on the "
            + " first position in an array list with %d elements.\n", time2 - time1, obj1.sizeArrayList() - 1);

        //checking how long it takes to insert an element on position 0 in a linked list
        time1 = System.currentTimeMillis();
        obj1.addLinkedList(0, "something");
        time2 = System.currentTimeMillis();
        System.out.printf("It took %d milliseconds to insert an element on the "
            + " first position in a linked list with %d elements", time2 - time1, obj1.sizeLinkedList() - 1);
    }
}
