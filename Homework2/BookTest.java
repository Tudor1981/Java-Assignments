//demonstrating the capabilities of the Book class

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Book[] bookArray = new Book[3];
        for (int i = 0; i < 3; i++){
            bookArray[i] = new Book("", 0, "", "");
        }

        //displaying the initial data in the members of the array

        System.out.println("\nEach book has the following initial data:");
        for (int i = 0; i < 3; i++){
            int j = i + 1;
            System.out.printf("\nBook " + j + ": \n%s\n", bookArray[i].getBookInfo());
        }
        System.out.println("\nInitially the books are empty.");

        //reading data for each book and displaying what changed

        System.out.println("\nIntroduce new data for each book.");
        for (int i = 0; i < 3; i++){
            int j = i + 1;
            System.out.print("\nNew book name for book " + j + " : ");
            String newBookName = reader.nextLine();
            System.out.print("New ISBN number for book " + j + " : ");
            String isbnStr = reader.nextLine();
            long newISBN = Long.parseLong(isbnStr);
            System.out.print("New author name for book " + j + " : ");
            String newAuthor = reader.nextLine();
            System.out.print("New publisher for book " + j + " : ");
            String newPublisher = reader.nextLine();

            //lets see how things change
            System.out.println("\nThe following changes occurred in book " + j + " : ");
            System.out.printf("Book name : %s ---> ", bookArray[i].getBookName());
            bookArray[i].setBookName(newBookName);
            System.out.printf("%s.\n", bookArray[i].getBookName());
            System.out.printf("ISBN number : %d ---> ", bookArray[i].getIsbnNumber());
            bookArray[i].setIsbnNumber(newISBN);
            System.out.printf("%d.\n", bookArray[i].getIsbnNumber());
            System.out.printf("Author name : %s ---> ", bookArray[i].getAuthorName());
            bookArray[i].setAuthorName(newAuthor);
            System.out.printf("%s.\n", bookArray[i].getAuthorName());
            System.out.printf("Publisher : %s ---> ", bookArray[i].getPublisher());
            bookArray[i].setPublisher(newPublisher);
            System.out.printf("%s.\n", bookArray[i].getPublisher());
        }

        System.out.println("Each book has the following summaries after the changes above:\n");
        for (int i = 0; i < 3; i++){
            int j = i + 1;
            System.out.printf("\nBook " + j + ": \n%s\n", bookArray[i].getBookInfo());
        }
    }
}
