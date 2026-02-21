package Java_Learn.Projects.File_Handling;


import java.io.IOException;
import java.util.Scanner;

public class File_Handle {
    public static void main(String[] args) throws IOException {
        byte choice;
        Scanner input = new Scanner(System.in);
        baseFileHandle handling = new Text_Handling();
        outerloop:
        while (true) {
            System.out.println("Welcome to file Handling...");
            System.out.println("---------------------------------------");
            System.out.println("Enter (full) path (with filename): ");
            handling.open(input.nextLine());

            System.out.println("1. Text File\n2. Binary File\n3. Exit");
            choice = input.nextByte();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1. Read\n2. Write\n3. Append\n4. Exit");
                    choice = input.nextByte();
                    input.nextLine();
                    switch (choice) {
                        case 1:
                            handling.reader();
                            break;
                        case 2:
                            while (true) {
                                System.out.println("Enter Line: ");
                                String lines = input.nextLine();
                                if (lines.equalsIgnoreCase("end")) {
                                    break;
                                }
                                handling.writer(lines);
                            }
                            break;
                        case 3:
                            while (true) {
                                System.out.println("Enter Line: ");
                                String lines = input.nextLine();
                                if (lines.equalsIgnoreCase("end")) {
                                    break;
                                }
                                handling.append(lines);
                            }
                            break;
                        case 4:
                            break outerloop;
                        default:
                            System.out.println("Invalid input....");
                    }

                    break;


                case 2:
                    System.out.println("Work in progress...");
                    break;
                case 3:
                    break outerloop;
                default:
                    System.out.println("Invalid choice...");
            }
        }
    }
}
