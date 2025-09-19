//Repeat Q1 with do while

package learn-buzz.CodeWithHarry.Loops.PS;

public class PS_Q7b {
    public static void main(String[] args) {
        int i = 0;
        do{
            int j = 4;
            do{
                System.out.print("*");
                j--;
            }while(j>i);
            System.out.print("\n");
            i++;
        }while(i<4);
    }
}
