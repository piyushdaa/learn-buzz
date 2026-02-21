package Java_Learn.File_Handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Practice_01 {
//    static void main() {
//        try (Scanner input = new Scanner(new File("C:\\Users\\pc\\Desktop\\Doc.txt"))) {
//            if (!input.hasNext()) {
//                try (PrintWriter write = new PrintWriter(new File("C:\\Users\\pc\\Desktop\\Doc.txt"))) {
//                    Scanner writer = new Scanner(System.in);
//                    System.out.println("Enter next line: ");
//                    String in = writer.nextLine();
//                    while (!in.equalsIgnoreCase("end")) {
//                        write.println(in);
//                        System.out.println("Enter next line: ");
//                        in = writer.nextLine();
//                    }
//                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
//                }
//            } else {
//                while (input.hasNext()) {
//                    String line = input.nextLine();
//                    System.out.println(line);
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
public static void main(String[] args) {
    File myFile = new File(System.getProperty("user.home") + "/Desktop/Doc.txt");

    try {
        // 1. Check if file exists and has content
        if (!myFile.exists() || myFile.length() == 0) {
            // Use try-with-resources for both the file writer and the console scanner
            try (PrintWriter writer = new PrintWriter(myFile)) {
                try (Scanner keyboard = new Scanner(System.in)) {

                    System.out.println("File is empty. Enter text (type 'end' to stop):");
                    while (true) {
                        String line = keyboard.nextLine();
                        if (line.equalsIgnoreCase("end")) break;
                        writer.println(line);
                    }
                }
            }
        } else {
            // 2. Read the file if it's not empty
            try (Scanner fileReader = new Scanner(myFile)) {
                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
            }
        }
    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}
}
