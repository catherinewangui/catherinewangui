import java.util.ArrayList;
import java.util.Scanner;

public class Library{
    static ArrayList<Book> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("******** Welcome to the Library Catalog ********");
        System.out.println("1: Add new book");
        System.out.println("2:Display all books ");
        System.out.println("3: Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.print("Enter book title: ");
        String title = scanner.next();
        System.out.print("Enter book author:Name ");
        String author = scanner.next();

      
        System.out.println("Book added successfully!");
        System.out.println("List of Books:Beauty and The Beast, Ratattoulie, Rio");
 
}
}

        

   
    public static void main(Str