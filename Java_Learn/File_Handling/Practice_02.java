
package Java_Learn.File_Handling;

import java.io.*;
import java.util.Scanner;

public class Practice_02 {
    static void main() {
        File check = new File("Doc.txt");
        byte choice;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to file handling...");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Write\n2. Read\n3. Append\n4. Exit");
            choice = input.nextByte();
            input.nextLine();
            if (choice == 1) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(check))) {
                    System.out.println("Enter line: ");
                    while (true) {

                        String line = input.nextLine();
                        if (line.equalsIgnoreCase("end")) {
                            break;
                        }
                        writer.write(line);
                        writer.newLine();

                    }
                    System.out.println("Writing Completed");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (choice == 2) {
                if (check.exists()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(check))) {
                        reader.readAllLines();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    System.out.println("File Not Found......");
                }
            } else if (choice == 3) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(check, true))) {
                    System.out.println("Enter Line: ");

                    while (true) {
                        String line = input.nextLine();
                        if (line.equalsIgnoreCase("end")) {
                            break;
                        }
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } else if (choice == 4) {
                break;
            }
        }
        input.close();
    }
}

/*
package Java_Learn.File_Handling;

import java.io.*;
import java.util.Scanner;

public class Practice_02 {

    public static void main(String[] args) {

        File check = new File("Doc.txt");
        Scanner input = new Scanner(System.in);

        outerloop:
        while (true) {
            System.out.println("\nWelcome to file handling...");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Write\n2. Read\n3. Append\n4. Exit");
            System.out.print("Enter choice: ");

            byte choice = input.nextByte();
            input.nextLine(); // consume leftover newline

            switch (choice) {

                case 1: // WRITE (overwrite)
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(check))) {
                        System.out.println("Start writing (type 'end' to stop):");

                        while (true) {
                            String line = input.nextLine();

                            if (line.equalsIgnoreCase("end")) {
                                break;
                            }

                            writer.write(line);
                            writer.newLine();
                        }

                        System.out.println("Writing completed.");
                    } catch (IOException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;

                case 2: // READ
                    if (!check.exists()) {
                        System.out.println("File does not exist.");
                        break;
                    }

                    try (BufferedReader reader = new BufferedReader(new FileReader(check))) {
                        String line;

                        System.out.println("\nFile Content:");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }

                    } catch (IOException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;

                case 3: // APPEND
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(check, true))) {
                        System.out.println("Start appending (type 'end' to stop):");

                        while (true) {
                            String line = input.nextLine();

                            if (line.equalsIgnoreCase("end")) {
                                break;
                            }

                            writer.write(line);
                            writer.newLine();
                        }

                        System.out.println("Appending completed.");
                    } catch (IOException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break outerloop;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
*/
