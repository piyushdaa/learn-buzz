//Online Library for 100 boooks

import java.util.Scanner;

//Book Class
class Books {
    String title;
    String author;
    boolean isIssued;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public Books(String title) {
        this.title = title;
        this.author = "Unknown";
        this.isIssued = false;
    }
}

//library Class
class Library {
    Books[] books;
    int bookcount;

    public Library() {
        this.books = new Books[100];
        this.bookcount = 0;
    }

    //Method to add book
    public void addBook(Books booktoadd) {
        this.books[this.bookcount] = booktoadd;
        this.bookcount++;
    }

    //Method to show available books
    public void showAvailableBooks() {
        if (this.bookcount == 0) {
            System.out.println("There are no books.");
        } else {
            for (int i = 0; i < this.bookcount; i++) {
                if (!this.books[i].isIssued) {
                    System.out.println(this.books[i].title + " by " + this.books[i].author);
                }
            }
        }
    }

    //Method to issue books
    public void issueBook(String title) {
        if (this.bookcount == 0) {
            System.out.println("No books to issue...");
        } else {
            boolean y = true;
            for (int i = 0; i < this.bookcount; i++) {

                if (this.books[i].title.equalsIgnoreCase(title)) {
                    if (this.books[i].isIssued) {
                        System.out.println("This book is already issued...");
                        y = false;
                        break;
                    } else {
                        System.out.println("Issuing book " + this.books[i].title + "...");
                        this.books[i].isIssued = true;
                        System.out.println(this.books[i].title + " is issued.");
                        y = false;
                        break;
                    }
                }
            }
            if (y) {
                System.out.println("Book Not Found.");
            }
        }
    }

    //Method to return book
    public void returnBook(String title) {
        if (this.bookcount == 0) {
            System.out.println("No Books...");
        } else {
            boolean y = true;
            for (int i = 0; i < this.bookcount; i++) {
                if (this.books[i].title.equalsIgnoreCase(title)) {
                    if (this.books[i].isIssued) {
                        this.books[i].isIssued = false;
                        y = false;
                        System.out.println(this.books[i].title + " is returned.");
                        break;
                    } else {
                        System.out.println("You didn't take the book.");
                        y = false;
                        break;
                    }
                }
            }
            if (y) {
                System.out.println("There is no book by that name.");
            }
        }
    }
}

public class Online_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library myLib = new Library();
        System.out.println("Welcome To My Library");

        //Menu Driven
        while (true) {
            System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4.Show Available Books\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter the title: ");
                String book_name = sc.nextLine();
                System.out.println("Enter " + book_name + "'s author: ");
                String book_author = sc.nextLine();
                if (book_author.isBlank()) {
                    myLib.addBook(new Books(book_name));
                } else {
                    myLib.addBook(new Books(book_name, book_author));
                }
            }

            else if (choice == 2) {
                System.out.println("Enter name: ");
                String book_name = sc.nextLine();
                myLib.issueBook(book_name);
            }

            else if (choice == 3) {
                System.out.println("Enter name: ");
                String book_name = sc.nextLine();
                myLib.returnBook(book_name);

            }

            else if (choice == 4) {
                myLib.showAvailableBooks();
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid Choice...");
            }

        }
        sc.close();
    }
}