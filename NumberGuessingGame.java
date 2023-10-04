import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Numbebr Guessing Game. The program has generated a random number between 1 and 100. You have to guess it. You have 10 tries. Every time you guess the number the program tells you whether your number is smaller than or bigger than the number that the computer has generated. Please only enter INTEGERS!");
        

        int randomNumber = (int) (Math.random() * 100);
        randomNumber = randomNumber + 1;
        
        // System.out.println(randomNumber);

        int lives = 10;
        boolean guessed = false;
        
        do {
        System.out.print("Enter your guess: ");
        int userGuess;
        userGuess = scanner.nextInt();
        
        if(userGuess == randomNumber){
            System.out.println(" CONGRATS! You have guessed the number. " + "The number was " + randomNumber + ". You had " + lives + " lives left." );
            guessed = true;
            
        } else if(userGuess > randomNumber){
            System.out.println("WRONG! Your guess is BIGGER than the number. Try a SMALLER number.");
            lives = lives - 1;
            System.out.println("You have " + lives + " lives left.");
        } else {
            System.out.println("WRONG! Your guess is SMALLER than the number. Try a BIGGER number.");
            lives = lives - 1;
            System.out.println("You have " + lives + " lives left.");
        }
        
        } while((lives > 0) && (guessed == false));
        
        if(lives == 0){
            System.out.println("YOU LOST! The number was " + randomNumber);
        }
        
        scanner.close();

    };
}


