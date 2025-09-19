//Repeat Q1 with while

package Java_Learn.Loops.PS;

public class PS_Q7a {
    public static void main(String[] args) {
        int i = 0;

        while (i<4){
            int j = 4;
            while (j>i){
                System.out.print("*");
                j--;
            }
            System.out.print("\n");
            i++;
        }
    }
}
