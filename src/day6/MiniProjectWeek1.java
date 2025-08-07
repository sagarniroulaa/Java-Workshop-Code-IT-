package day6;

import java.util.Random;
import java.util.Scanner;

public class MiniProjectWeek1 {
    
    // Number Guessing Game
    // Loop, Scanner class (for user input), Random (generates random numbers)
    // If, else

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number
        int secretNumber = random.nextInt(100) + 1; // (0-99) + 1 = (1-100)
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Pick a number between 1 and 100.");

        // Loop until user guesses correctly
        while(true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if(guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if(guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right.");
                System.out.println("It took you " + attempts + " attempts.");
                break; // Exit the loop
            }
        }

        scanner.close();
    }
}
