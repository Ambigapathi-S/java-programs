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
            if(n == 1){  // add book details
                System.out.print("Enter Book ID: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                Book newBook = new Book(bookId, title, author, true);
                library.addBook(newBook);
            } else if(n == 2){ // get all the book details
                library.displayAllBooks();
            } else if (n == 3) { // search book based on book id
                System.out.print("Enter Book ID : ");
                int searchID = scanner.nextInt();
                Book searchTheBook = library.searchBook(searchID);
                if (searchTheBook != null) {
                    System.out.println(searchTheBook + " is available");
                } else {
                    System.out.println("Book is not available.");
                }
            } else if (n == 4) { // remove book
                System.out.print("Enter Book ID to remove: ");
                int removeID = scanner.nextInt();
                library.removeBook(removeID);
            } else { // to end the process
                System.out.println("Press Valid Option or Press 0 to quit");
                isQuit = true;
                scanner.close();
            }
        }
    }
}

//        Output :
//
//        1. Add Book
//        2. Display All Book
//        3. Search Book
//        4. Delete Book
//        Press 0 to quit the process
//        __________________________________________
//        1
//        Enter Book ID: 1
//        Enter Title: The Secret
//        Enter Author: john
//        Book added successfully.
//        __________________________________________
//        1. Add Book
//        2. Display All Book
//        3. Search Book
//        4. Delete Book
//        Press 0 to quit the process
//        __________________________________________
//        1
//        Enter Book ID: 2
//        Enter Title: Kids Stories
//        Enter Author: Raji
//        Book added successfully.
//        __________________________________________
//        1. Add Book
//        2. Display All Book
//        3. Search Book
//        4. Delete Book
//        Press 0 to quit the process
//        __________________________________________
//        2
//        Books in the library:
//        {bookId=1, title='The Secret', author='john', isAvailable=true}
//        {bookId=2, title='Kids Stories', author='Raji', isAvailable=true}
//        __________________________________________
//        1. Add Book
//        2. Display All Book
//        3. Search Book
//        4. Delete Book
//        Press 0 to quit the process
//        __________________________________________
//        3
//        Enter Book ID : 1
//        {bookId=1, title='The Secret', author='john', isAvailable=true} is available
//        1. Add Book
//        2. Display All Book
//        3. Search Book
//        4. Delete Book
//        Press 0 to quit the process
//        __________________________________________
//        4
//        Enter Book ID to remove: 2
//        Book removed successfully.
//        __________________________________________
//        1. Add Book
//        2. Display All Book
//        3. Search Book
//        4. Delete Book
//        Press 0 to quit the process
//        __________________________________________
