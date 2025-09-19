//****
//***
//**
//*

package learn-buzz.CodeWithHarry.Loops.PS;


public class PS_Q1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
