import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = rd.nextInt(1,10);
        
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10: ");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
        } while (guess != randomNumber);
        
        System.out.println("Match found!");
        System.out.println("You took "+attempts+" attempts to match your guessed number with random number!");

        sc.close();
    }
}
