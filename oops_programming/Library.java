package oops_programming;

public class Library {
    private Book[] books;
    private int numOfBooks;
    public Library(int capacity) {
        books = new Book[capacity];
        numOfBooks = 0;
    }

    public void addBook(Book book) {
        books[numOfBooks++] = book;
        System.out.println("Book added successfully.");
        System.out.println("__________________________________________");
    }

    public void displayAllBooks() {
        if (numOfBooks == 0) {
            System.out.println("No books available in the library.");
            System.out.println("__________________________________________");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < numOfBooks; i++) {
                System.out.println(books[i].toString());
            }
            System.out.println("__________________________________________");
        }
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getBookId() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getBookId() == bookID) {
                books[i].setAvailable(false);
                System.out.println("Book removed successfully.");
                System.out.println("__________________________________________");
                return;
            }
        }
        System.out.println("Book ID " + bookID + " is not available.");
        System.out.println("__________________________________________");
    }




}
