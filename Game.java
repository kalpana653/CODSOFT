import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maximumVal = 100; 
        int rNumber = random.nextInt(maximumVal) + 1; 
        boolean play=true;
		while (play) {
        System.out.println("-----------Welcome!!--------------");
        System.out.println("You Have Ten(10) Chance to Guess the Number:)");
        System.out.println("----------------------------------------------------");
        System.out.println("Try to guess the number between 1 and " + maximumVal);
     
        
        int guess;
        boolean hasGuessedRight = false;
        int attempt = 0;
        
        while (!hasGuessedRight) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempt++;
           if(attempt==10) {
        	   System.out.println("you have reach your limits!!");
        	   break;
           }
           
            
            if (guess == rNumber) {
                hasGuessedRight = true;
                System.out.println("Congratulations!");
                System.out.println( " You've guessed the correct number in " + attempt + " attempts.");
                System.out.println("yaaayy..^~^");
            } else if (guess < rNumber) {
                System.out.println("Try Higher Number!! You Can");
            } else {
                System.out.println("Try Lower Number!!<Guess it>");
            }
        } 
        System.out.print(" OK COOL...!Do you want to play again??->1 for Yes,-> 0 for No): ");
        int UserWish = scanner.nextInt();
        if (UserWish != 1) {
            play = false;
		}
		}
   
		scanner.close();
    }
}