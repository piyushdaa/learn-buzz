package Java_Learn.Projects.File_Handling;
import java.io.File;

public abstract class baseFileHandle {
    protected String path; //For path
    protected File file; //For file object (Shared among these)

    public void open(String path) {
        this.path = path;
        file = new File(path); //Everyone will share common path
    }

    public abstract void reader();
    public abstract void writer(String lines);
    public abstract void append(String lines);
}
