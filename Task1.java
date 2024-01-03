import java.util.Scanner;
import java.util.Random;

public class Task1{
    
    public static String guessRan()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minR = 1;
        int maxR = 100;
        int rounds = 0; 
        int score = 0;
        

        System.out.println("Welcome to the Number Guessing Game!");

        int randomNumber = random.nextInt(maxR - minR + 1) + minR;
        int attempts = 0;
        boolean guessedCorrectly = false;
        System.out.println("Guess the number between " + minR + " and " + maxR + ".");
        while (!guessedCorrectly) {
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                guessedCorrectly = true;
                return ("Congratulations! You guessed the number " + randomNumber + " correctly!");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        
        System.out.println("kalyani");
        System.out.println(guessRan());
        
    }
}

