package oops_programming;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(10000);
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("1. Add Book");
            System.out.println("2. Display All Book");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("Press 0 to quit the process");
            System.out.println("__________________________________________");
            int n = scanner.nextInt();
            scanner.nextLine();
            if(n == 1){
                System.out.print("Enter Book ID: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                Book newBook = new Book(bookId, title, author, true);
                library.addBook(newBook);
            } else if(n == 2){
                library.displayAllBooks();
            } else if (n == 3) {
                System.out.print("Enter Book ID : ");
                int searchID = scanner.nextInt();
                Book searchTheBook = library.searchBook(searchID);
                if (searchTheBook != null) {
                    System.out.println(searchTheBook + " is available");
                } else {
                    System.out.println("Book is not available.");
                }
            } else if (n == 4) {
                System.out.print("Enter Book ID to remove: ");
                int removeID = scanner.nextInt();
                library.removeBook(removeID);
            } else {
                System.out.println("Press Valid Option or Press 0 to quit");
                isQuit = true;
                scanner.close();
            }
        }
    }
}
