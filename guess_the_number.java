package Internship.Task1;

// import required classes and packages  
import java.util.Random;
import java.util.Scanner;

//create guess_the_number class
public class guess_the_number{

        //main method starts  
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int guessNumber = rand.nextInt(100)+1; //Random Number

        int tries = 0; // For Counting the attempts
        while(true){
            System.out.println("Enter a number between 1 - 100 :");
            int userGuess = scanner.nextInt();
            tries++;
            if (userGuess == guessNumber){
                System.out.println("Your Guess is correct!");
                System.out.println("It took you " + tries + " attempts"); // Display the attempts
                break;
            }
            else if(guessNumber > userGuess){
                System.out.println("Incorrect! Enter a higher Number");
            }
            else{
                System.out.println("Incorrect! Enter a lower Number");
            }
        }
    }
}