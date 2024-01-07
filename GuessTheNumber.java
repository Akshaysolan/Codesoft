import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Guess the Number!");

        boolean playAgain = true;
        int totalRounds = 0;
        int totalAttempts = 0;

        while (playAgain) {
            
            int targetNumber = random.nextInt(100) + 1;

           
            int maxAttempts = 10;
            int attempts = 0;

            System.out.println("\nRound " + (totalRounds + 1) + " - Guess the number between 1 and 100:");

            while (attempts < maxAttempts) {
                
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + (attempts + 1) + " attempts.");
                    totalAttempts += attempts + 1;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
            }

           
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }

            totalRounds++;
        }

        
        System.out.println("\nGame Over! You played " + totalRounds + " rounds and took an average of " + (double) totalAttempts / totalRounds + " attempts per round.");
    }
}
