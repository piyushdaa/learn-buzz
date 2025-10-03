/**
 * Online Library Management System
 * This program manages a library of up to 100 books with functionality to add, issue, and return books
 */

// Import Scanner class for reading user input
import java.util.Scanner;

/**
 * Books class - Represents a book in the library
 * Contains book title, author, and issue status
 */
class Books {
    // Book title
    String title;
    
    // Book author
    String author;
    
    // Flag to track if book is currently issued
    boolean isIssued;
    
    /**
     * Constructor with both title and author
     * @param title - The book's title
     * @param author - The book's author
     */
    public Books(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;  // Initially, book is not issued
    }
    
    /**
     * Constructor with only title (author will be set as "Unknown")
     * @param title - The book's title
     */
    public Books(String title) {
        this.title = title;
        this.author = "Unknown";  // Default author when not specified
        this.isIssued = false;     // Initially, book is not issued
    }
}

/**
 * Library class - Manages the collection of books
 * Provides methods to add, issue, return, and display books
 */
class Library {
    // Array to store up to 100 books
    Books[] books;
    
    // Counter to track number of books in library
    int bookcount;
    
    /**
     * Constructor - Initializes library with empty book array
     */
    public Library() {
        this.books = new Books[100];  // Create array for 100 books
        this.bookcount = 0;            // Start with zero books
    }
    
    /**
     * Method to add a new book to the library
     * @param booktoadd - The Books object to add to the library
     */
    public void addBook(Books booktoadd) {
        this.books[this.bookcount] = booktoadd;  // Add book at current count index
        this.bookcount++;                         // Increment book count
    }
    
    /**
     * Method to display all available (not issued) books
     * Lists each book's title and author
     */
    public void showAvailableBooks() {
        // Check if library has any books
        if (this.bookcount == 0) {
            System.out.println("There are no books.");
        } else {
            // Loop through all books in library
            for (int i = 0; i < this.bookcount; i++) {
                // Only display books that are not currently issued
                if (!this.books[i].isIssued) {
                    System.out.println(this.books[i].title + " by " + this.books[i].author);
                }
            }
        }
    }
    
    /**
     * Method to issue a book to a user
     * @param title - The title of the book to issue
     */
    public void issueBook(String title) {
        // Check if library has any books
        if (this.bookcount == 0) {
            System.out.println("No books to issue...");
        } else {
            boolean y = true;  // Flag to track if book was found
            
            // Search for the book by title
            for (int i = 0; i < this.bookcount; i++) {
                // Compare book title (case-insensitive)
                if (this.books[i].title.equalsIgnoreCase(title)) {
                    // Check if book is already issued
                    if (this.books[i].isIssued) {
                        System.out.println("This book is already issued...");
                        y = false;
                        break;
                    } else {
                        // Issue the book
                        System.out.println("Issuing book " + this.books[i].title + "...");
                        this.books[i].isIssued = true;  // Mark as issued
                        System.out.println(this.books[i].title + " is issued.");
                        y = false;
                        break;
                    }
                }
            }
            
            // If book was not found in the library
            if (y) {
                System.out.println("Book Not Found.");
            }
        }
    }
    
    /**
     * Method to return a book to the library
     * @param title - The title of the book to return
     */
    public void returnBook(String title) {
        // Check if library has any books
        if (this.bookcount == 0) {
            System.out.println("No Books...");
        } else {
            boolean y = true;  // Flag to track if book was found
            
            // Search for the book by title
            for (int i = 0; i < this.bookcount; i++) {
                // Compare book title (case-insensitive)
                if (this.books[i].title.equalsIgnoreCase(title)) {
                    // Check if book is currently issued
                    if (this.books[i].isIssued) {
                        this.books[i].isIssued = false;  // Mark as returned
                        y = false;
                        System.out.println(this.books[i].title + " is returned.");
                        break;
                    } else {
                        // Book exists but was never issued
                        System.out.println("You didn't take the book.");
                        y = false;
                        break;
                    }
                }
            }
            
            // If book was not found in the library
            if (y) {
                System.out.println("There is no book by that name.");
            }
        }
    }
}

/**
 * Main class - Online_Library
 * Contains the main method that runs the library management system
 */
public class Online_Library {
    
    /**
     * Main method - Entry point of the program
     * Provides a menu-driven interface for library operations
     */
    public static void main(String[] args) {
        // Create Scanner object for reading user input
        Scanner sc = new Scanner(System.in);
        
        // Create new Library instance
        Library myLib = new Library();
        
        // Welcome message
        System.out.println("Welcome To My Library");
        
        // Menu-driven infinite loop
        while (true) {
            // Display menu options
            System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4.Show Available Books\n5. Exit");
            
            // Read user's choice
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline character
            
            // Option 1: Add a new book
            if (choice == 1) {
                System.out.println("Enter the title: ");
                String book_name = sc.nextLine();
                
                System.out.println("Enter " + book_name + "'s author: ");
                String book_author = sc.nextLine();
                
                // If author is blank, use constructor without author
                if (book_author.isBlank()) {
                    myLib.addBook(new Books(book_name));
                } else {
                    myLib.addBook(new Books(book_name, book_author));
                }
            }
            // Option 2: Issue a book
            else if (choice == 2) {
                System.out.println("Enter name: ");
                String book_name = sc.nextLine();
                myLib.issueBook(book_name);
            }
            // Option 3: Return a book
            else if (choice == 3) {
                System.out.println("Enter name: ");
                String book_name = sc.nextLine();
                myLib.returnBook(book_name);
            }
            // Option 4: Show all available books
            else if (choice == 4) {
                myLib.showAvailableBooks();
            }
            // Option 5: Exit the program
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;  // Exit the loop
            }
            // Invalid option
            else {
                System.out.println("Invalid Choice...");
            }
        }
        
        // Close the Scanner to free resources
        sc.close();
    }
}
