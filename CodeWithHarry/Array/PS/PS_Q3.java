//average marks of all students using for each loop

package learn-buzz.CodeWithHarry.Array.PS;
import java.util.Scanner;

public class PS_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        float[] marks = new float[sc.nextInt()];
        int i = 0;
        while (i< marks.length){
            System.out.print("Enter marks: ");
            marks[i] = sc.nextFloat();
            i++;
        }
        float total_marks = 0;
        for (float students: marks){
            total_marks += students;
        }
        System.out.print("Total marks: "+(total_marks/marks.length));
    }
}
