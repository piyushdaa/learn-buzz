package Java_Learn.Projects.File_Handling;


import java.io.IOException;
import java.util.Scanner;

public class File_Handle {
    public static void main(String[] args) throws IOException {

        byte choice; // Using byte for menu selection to minimize memory footprint
        Scanner input = new Scanner(System.in);

        baseFileHandle handling = new Text_Handling(); // Utilizing Polymorphism to allow interchangeable file handling strategies (Text vs Binary)

        //Menu for read/write/append
        outerloop: while (true) {

            System.out.println("Welcome to file Handling...");
            System.out.println("---------------------------------------");
            System.out.println("Enter (full) path (with filename): ");

            handling.open(input.nextLine()); // Capturing the absolute or relative path for the target resource.

            System.out.println("1. Text File\n2. Binary File\n3. Exit");

            choice = input.nextByte(); // Capturing user intent for menu navigation.
            input.nextLine(); // Consume leftover newline character to prevent Scanner skipping

            switch (choice) {
                case 1:
                    System.out.println("1. Read\n2. Write\n3. Append\n4. Exit");
                    choice = input.nextByte(); //took choice from the user
                    input.nextLine(); // Consume leftover newline character to prevent Scanner skipping
                    switch (choice) {
                        case 1:
                            handling.reader(); // Invoking the reader method to process file contents.
                            break;
                        case 2:
                            while (true) {
                                System.out.println("Enter Line: ");
                                String lines = input.nextLine(); // Utilizing line-buffering to minimize expensive disk I/O operations.
                                if (lines.equalsIgnoreCase("end")) {
                                    break; // Sentinel value "end" triggers loop termination.
                                }
                                handling.writer(lines); // Executing line-level write operation to destination.
                            }
                            break;
                        case 3:
                            while (true) {

                                // Mirrors write logic but delegates to the append method for persistence.


                                System.out.println("Enter Line: ");
                                String lines = input.nextLine();
                                if (lines.equalsIgnoreCase("end")) {
                                    break;
                                }
                                handling.append(lines);
                            }
                            break;
                        case 4:
                            break outerloop; // Terminates the application loop and begins cleanup
                        default:
                            System.out.println("Invalid input....");
                    }

                    break;

                case 2:
                    System.out.println("Work in progress...");
                    break;
                case 3:
                    break outerloop; // Terminates the application loop and begins cleanup
                default:
                    System.out.println("Invalid choice...");
            }
        }input.close(); // Releasing system resources to prevent memory leaks.
    }
}
