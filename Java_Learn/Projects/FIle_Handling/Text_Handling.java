package Java_Learn.Projects.File_Handling;
import java.io.*;

public class Text_Handling extends baseFileHandle{

    @Override
    public void reader(){
        if (file.exists()){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            for (String line : reader.readAllLines()){
                System.out.println(line);
            }
        }catch (IOException io){
            System.out.println(io.getMessage());
        }}else{
        System.out.println("File Not Found....");}
    }
    @Override
    public void writer(String lines){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(lines);
            writer.newLine();
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
    @Override
    public void append(String lines){
        try (BufferedWriter appender = new BufferedWriter(new FileWriter(file,true))){
            appender.append(lines);
            appender.newLine();

        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}
