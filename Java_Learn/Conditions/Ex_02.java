//Rock, paper scissor game

package Java_Learn.Conditions;

import java.util.Scanner;
import java.util.Random;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ROCK, PAPER, SCISSORS...");

        String[] choices = {"rock", "paper", "scissor"};
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine().toLowerCase();

        Random r = new Random(System.currentTimeMillis());

        String cc = choices[r.nextInt(0, 3)];
        System.out.println("Computer Choice: " + cc);

        if (choice.equals(cc)) {
            System.out.print("Tie!");
        } else if ((choice.equals("paper") && cc.equals("rock")) || (choice.equals("scissor") && cc.equals("paper")) || (choice.equals("rock") && cc.equals("scissor"))) {
            System.out.print("You Win!");
        } else {
            System.out.print("You Lose!");
        }
        sc.close();
    }
}
