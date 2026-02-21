package Java_Learn.File_Handling;

public class Book_Example {
    static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("D:\\IDEA Projects\\Basics\\image");
            System.out.println("Does it exist? " + file.exists());
            System.out.println("The file has " + file.length() + " bytes.");
            System.out.println("Can it be read ? " + file.canRead());
            System.out.println("Can it be written? " + file.canWrite());
            System.out.println("Is it a directory? " + file.isDirectory());
            System.out.println("Is it a file? " + file.isFile());
            System.out.println("Is it absolute? " + file.isAbsolute());
            System.out.println("Is it hidden? " + file.isHidden());
            System.out.println("Absolute path is " + file.getAbsolutePath());
            System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
