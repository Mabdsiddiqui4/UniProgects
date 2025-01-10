package progect_2;

import java.util.Random;
import java.util.Scanner;

public class GameInProgram {
    public static void main(String[] args) {
        
        
     
        Random random = new Random();
        int lotteryNumber = 100 + random.nextInt(900);

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess (a three-digit number):");
        int userGuess = scanner.nextInt();

        
        int lotteryDigit1 = lotteryNumber / 100;
        int lotteryDigit2 = (lotteryNumber / 10) % 10;
        int lotteryDigit3 = lotteryNumber % 10;

        int userDigit1 = userGuess / 100;
        int userDigit2 = (userGuess / 10) % 10;
        int userDigit3 = userGuess % 10;

        
        int reward = 0;
        if (userGuess == lotteryNumber) {
            reward = 10000;
            System.out.println("Congrats! You guessed the number! You won 10000 TL!");
        } else if ((lotteryDigit1 == userDigit1 && lotteryDigit2 == userDigit2) || 
                   (lotteryDigit2 == userDigit2 && lotteryDigit3 == userDigit3)) {
            reward = 100;
            System.out.println("You matched two consecutive digits. You won 100 TL!");
        } else if ((lotteryDigit1 == userDigit1) || (lotteryDigit2 == userDigit2) || (lotteryDigit3 == userDigit3)) {
            reward = 10;
            System.out.println("You matched only one digit. You won 10 TL!");
        } else if ((lotteryDigit1 == userDigit2 && lotteryDigit2 == userDigit3 && lotteryDigit3 == userDigit1) || 
                   (lotteryDigit1 == userDigit3 && lotteryDigit2 == userDigit1 && lotteryDigit3 == userDigit2)) {
            reward = 1000;
            System.out.println("You matched three digits in different order. You won 1000 TL!");
        } else if ((lotteryDigit1 == userDigit1 || lotteryDigit1 == userDigit2 || lotteryDigit1 == userDigit3) &&
                   (lotteryDigit2 == userDigit1 || lotteryDigit2 == userDigit2 || lotteryDigit2 == userDigit3) &&
                   (lotteryDigit3 == userDigit1 || lotteryDigit3 == userDigit2 || lotteryDigit3 == userDigit3)) {
            reward = 1000;
            System.out.println("You matched three digits in different order. You won 1000 TL!");
        } else {
            System.out.println("The correct number was " + lotteryNumber + ". You lost!");
        }

        scanner.close();
    }
}
