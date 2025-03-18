import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        System.out.println("Welcome to the Number Quest game!");
        while (playAgain) {
            int comp = random.nextInt(100) + 1;
            int attempts = 0;
            int guess;
            System.out.println("I will choose a number from 1 and 100, Try to guess it");
            while (true){
                System.out.print("Enter your Guess: ");
                if (sc.hasNextInt()) {
                    guess = sc.nextInt();
                    System.out.println();
                    if (guess < 1 || guess > 100) {
                        System.out.println("Please guess a number between 1 and 100!");
                        continue;
                    }
                    attempts++;
                    if (guess < comp) {
                        System.out.println("Too Low! Try again");
                    } else if (guess > comp) {
                        System.out.println("Too High! Try again");
                    } else {
                        System.out.println("Congratulations! You guessed it in " + attempts + " attempts");
                        break;
                    }
                } else {
                    System.out.println("Invalid Input! Please enter a number.");
                    sc.next();
                }
            }
            System.out.println("Do you want to Play Again? (yes/no)");
            String response = sc.next().toLowerCase();
            if (!response.startsWith("y")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        sc.close();
    }
}