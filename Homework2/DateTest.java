//testing the capabilities of Date

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Date date1 = new Date(11, 17, -785);
        Date date2 = new Date(1, 12, 1456);

        //displaying the initial info in each object plus the date in the requested format
        System.out.println("\nThe initial information in date1 is:\n\n" + date1.toString());
        System.out.print("The date: ");
        date1.displayDate();

        System.out.println("\n\nThe initial information in date2 is:\n\n" + date2.toString());
        System.out.print("The date: ");
        date2.displayDate();

        //changing the info in each object and displaying how it changed

        //date1
        System.out.println("\n\nReading new data for date1.\n");
        System.out.print("The new month: ");
        int month1 = reader.nextInt();
        System.out.print("The new day: ");
        int day1 = reader.nextInt();
        System.out.print("The new year: ");
        int year1 = reader.nextInt();
        String dateBefore1 = date1.getDate();

        System.out.println("\nThis is how info has changed in date1:\n");
        System.out.printf("The month: %d ---> ", date1.getMonth());
        date1.setMonth(month1);
        System.out.printf("%d.\n", date1.getMonth());
        System.out.printf("The day: %d ---> ", date1.getDay());
        date1.setDay(day1);
        System.out.printf("%d.\n", date1.getDay());
        System.out.printf("The year: %d ---> ", date1.getYear());
        date1.setYear(year1);
        System.out.printf("%d.\n", date1.getYear());
        System.out.printf("After the changes above the old date %s turns to ", dateBefore1);
        date1.displayDate();

        //date2
        System.out.println("\n\nReading new data for date2.\n");
        System.out.print("The new month: ");
        int month2 = reader.nextInt();
        System.out.print("The new day: ");
        int day2 = reader.nextInt();
        System.out.print("The new year: ");
        int year2 = reader.nextInt();
        String dateBefore2 = date2.getDate();

        System.out.println("\nThis is how info has changed in date2:\n");
        System.out.printf("The month: %d ---> ", date2.getMonth());
        date2.setMonth(month2);
        System.out.printf("%d.\n", date2.getMonth());
        System.out.printf("The day: %d ---> ", date2.getDay());
        date2.setDay(day2);
        System.out.printf("%d.\n", date2.getDay());
        System.out.printf("The year: %d ---> ", date2.getYear());
        date2.setYear(year2);
        System.out.printf("%d.\n", date2.getYear());
        System.out.printf("After the changes above the old date %s turns to ", dateBefore2);
        date2.displayDate();
    }
}
