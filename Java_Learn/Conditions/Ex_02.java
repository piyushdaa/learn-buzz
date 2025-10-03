//Rock, Paper, Scissors Game
//This program implements a simple Rock, Paper, Scissors game where the player competes against the computer
package Java_Learn.Conditions;
import java.util.Scanner;
import java.util.Random;

public class Ex_02 {
    public static void main(String[] args) {
        // Create Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);
        
        // Display game title to the user
        System.out.println("ROCK, PAPER, SCISSORS...");
        
        // Define an array containing all possible choices in the game
        String[] choices = {"rock", "paper", "scissor"};
        
        // Prompt the user to enter their choice
        System.out.print("Enter your choice: ");
        
        // Read user input and convert it to lowercase for case-insensitive comparison
        String choice = sc.nextLine().toLowerCase();
        
        // Create a Random object with current time as seed to ensure different results each run
        Random r = new Random(System.currentTimeMillis());
        
        // Generate computer's random choice by selecting a random index from choices array (0 to 2)
        String cc = choices[r.nextInt(0, 3)];
        
        // Display the computer's choice to the user
        System.out.println("Computer Choice: " + cc);
        
        // Check if both player and computer chose the same option (tie condition)
        if (choice.equals(cc)) {
            System.out.print("Tie!");
        } 
        // Check all winning conditions for the player:
        // - Paper beats Rock
        // - Scissor beats Paper
        // - Rock beats Scissor
        else if ((choice.equals("paper") && cc.equals("rock")) || (choice.equals("scissor") && cc.equals("paper")) || (choice.equals("rock") && cc.equals("scissor"))) {
            System.out.print("You Win!");
        } 
        // If it's not a tie and player didn't win, then player loses
        else {
            System.out.print("You Lose!");
        }
        
        // Close the Scanner to free up system resources
        sc.close();
    }
}
