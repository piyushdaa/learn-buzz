//Guess the number game (OOPs Edition)

package Java_Learn.OOPs;

//Importing Scanner and Random Class


import java.util.Scanner;
import java.util.Random;


class game {
    private final int num;
    private int no_of_guess;

    public game(){
        Random rand = new Random();
        this.num = rand.nextInt(100)+1;
        this.no_of_guess = 0;
    }

    //Checking
    public boolean check(int guess){
        no_of_guess++;

        if (this.num == guess){
            System.out.printf("You WON!... in %d guesses.\n",no_of_guess);
            return true;
        }
        else if (this.num > guess){
            System.out.println("Higher Number...");
            return false;
        }
        else{
            System.out.println("Lower Number...");
            return false;
        }
    }

}
public class Ex_03 {
    public static void main(String[] args){

        //Creating Scanner and Game Object
        Scanner sc = new Scanner(System.in);
        game game0 = new game();
        boolean won = false;

        System.out.println("Guess a number between 1 and 100....");

        //Taking Input and checking
        while (!won){
            System.out.print("Enter guess: ");
            won = game0.check(sc.nextInt());
        }
        System.out.println("Game Over!");

    }
}
