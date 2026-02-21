//Guess the number game (OOPs Edition)
//This program implements a number guessing game using Object-Oriented Programming principles
//The computer generates a random number and the player tries to guess it

//Importing Scanner and Random Class
//Scanner: Used to read user input from the console
//Random: Used to generate random numbers
import java.util.Scanner;
import java.util.Random;

/**
 * Game class - Encapsulates the game logic and state
 * This class manages the secret number, tracks guesses, and validates player inputs
 */
class game {
    // Instance variable to store the secret number that the player must guess
    // 'final' keyword ensures this number cannot be changed once initialized
    private final int num;
    
    // Instance variable to track how many guesses the player has made
    private int no_of_guess;
    
    /**
     * Constructor - Initializes a new game instance
     * Automatically generates a random number between 1 and 100
     * Sets the guess counter to 0
     */
    public game(){
        // Create a Random object to generate random numbers
        Random rand = new Random();
        
        // Generate a random number between 1 and 100 (inclusive)
        // nextInt(100) generates 0-99, adding 1 makes it 1-100
        this.num = rand.nextInt(100)+1;
        
        // Initialize the guess counter to zero
        this.no_of_guess = 0;
    }
    
    /**
     * Method to check if the player's guess is correct
     * @param guess - The number guessed by the player
     * @return true if the guess is correct, false otherwise
     * Also provides feedback: "Higher" if guess is too low, "Lower" if guess is too high
     */
    //Checking
    public boolean check(int guess){
        // Increment the guess counter each time this method is called
        no_of_guess++;
        
        // Check if the guess matches the secret number
        if (this.num == guess){
            // Player guessed correctly - display win message with number of attempts
            System.out.printf("You WON!... in %d guesses.\n",no_of_guess);
            return true;
        }
        // Check if the secret number is greater than the guess (player guessed too low)
        else if (this.num > guess){
            // Guide the player to guess a higher number
            System.out.println("Higher Number...");
            return false;
        }
        // The secret number must be less than the guess (player guessed too high)
        else{
            // Guide the player to guess a lower number
            System.out.println("Lower Number...");
            return false;
        }
    }
}

/**
 * Main class - Entry point of the program
 * Manages the game flow and user interaction
 */
public class Guess_the_number {
    /**
     * Main method - Program execution starts here
     * Creates game instance, handles user input loop, and manages game state
     */
    public static void main(String[] args){
        //Creating Scanner and Game Object
        // Scanner object to read player input from console
        Scanner sc = new Scanner(System.in);
        
        // Create a new game instance (initializes with random number)
        game game0 = new game();
        
        // Boolean flag to track if the player has won (initially false)
        boolean won = false;
        
        // Display welcome message and instructions to the player
        System.out.println("Guess a number between 1 and 100....");
        
        //Taking Input and checking
        // Game loop - continues until the player guesses correctly
        while (!won){
            // Prompt the player to enter their guess
            System.out.print("Enter guess: ");
            
            // Read the player's guess and check it against the secret number
            // The check() method returns true if correct, false otherwise
            won = game0.check(sc.nextInt());
        }
        
        // Game has ended - display final message
        System.out.println("Game Over!");
    }
}
