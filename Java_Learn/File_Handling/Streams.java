package Java_Learn.File_Handling;
/*
A stream is simply a continuous flow of data.

Think of it like a river of data that you can read, process, or move somewhere — instead of having all the data in one container.

Stream is of two types: Byte Stream and Character stream

Byte stream is of two types: Input and Output
Character is of two types : Reader and Writer
 */

import java.io.IOException;
import java.io.InputStreamReader;

public class Streams {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter something: ");
            int letter = isr.read();
            while (isr.ready()){
                System.out.println((char) letter);
                letter = isr.read();
            }
            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
