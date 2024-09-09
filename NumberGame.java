import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        int rounds = 2; 
        int maxAttempts = 5; 

        System.out.println("welcome in to the number guess game:  ");
        System.out.println("NOTE:- you can only enter a number in the range between 1 to 100:");
        System.out.println("RULE:- you have only 5 attempts to guess a number.");
        
        for (int i = 1; i <= rounds; i++) {
        	
            System.out.println("\nRoundNo: " + i);
            
            int guess = random.nextInt(100) + 1; 
            boolean rightGuess = false;
            int attempts = 0;
            
            while (!rightGuess && attempts < maxAttempts) {
            	
                System.out.print("Enter your guess : ");
                
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < 1 || userGuess > 100) {
                	
                    System.out.println("you should enter a guess number in the range of 1 to 100.");
                } 
                else if (userGuess < guess) {
                	
                    System.out.println("ohh! it's too low guess higher than it.");
                }
                else if (userGuess > guess) {
                	
                    System.out.println("ohh! it's too high,guess lower than it.");
                } 
                else {
                    System.out.println("Congratulations! You guessed the right number.");
                    score += 100; // 
                    rightGuess = true;
                }
                
                if (!rightGuess && attempts < maxAttempts) {
                	
                    System.out.println("Available attempts: " + (maxAttempts - attempts));
                }
            }
            
            if (!rightGuess) {
            	
                System.out.println("Sorry, you've reached the limit of all your attempts." + guess);
            }
            
            System.out.println("You took " + attempts + " attempts.");
        }
        
        System.out.println("\nGame Over!");
        System.out.println("Your total score is: " + score);
        
        scanner.close();
    }
}
