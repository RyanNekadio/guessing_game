import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args){

        Random rand = new Random();

        int secretNumber = rand.nextInt();

        System.out.println("Welcome to Ryan's number Guessing Game!");

        System.out.println("Please, input an integer");

        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();

        if (guess > secretNumber){
            System.out.println("Incorrect! Your guess is too high!");
            System.out.println("The correct number was " + secretNumber);
            System.out.println("Thanks for playing!");
        } else if (guess < secretNumber) {
            System.out.println("Incorrect! Your guess is too low!");
            System.out.println("The correct number was " + secretNumber);
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Correct! You guessed correctly!");
            System.out.println("Thanks for playing!");
        }
    }
}