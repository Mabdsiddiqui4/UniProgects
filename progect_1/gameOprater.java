package progect_1;

import java.util.Random;
import java.util.Scanner;

public class gameOprater {

    public static void main(String[] args) {
        
        
        
            
        
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int timsOfQuestions = 0;
        int crrictAnser = 0; 
        
        int aCompurerHP5 = 100;
        for (int i = 0; i < 10; i++) {
        int num1 = rnd.nextInt(10);
        int num2 = rnd.nextInt(10);
        
        int operationNumber = rnd.nextInt(5) + 1;

        String Oprater = " ";
        int anser = 0;

        switch (operationNumber) {
            case 1:
                anser = num1 + num2;
                Oprater = "+";

                break;
            case 2:
                Oprater = "-";
                anser = num1 - num2;
                break;
            case 3:
                Oprater = "*";
                anser = num1 * num2;
                break;
            case 4:
                Oprater = "/";
                anser = num1 / num2;
                break;
            case 5:
                Oprater = "%";
                anser = num1 % num2;
                break;
        }
        System.out.println(num1 + " " + Oprater + " " + num2 + " = ");
        timsOfQuestions++;
        int userAnswer = in.nextInt();
        if (userAnswer == anser) {
            int cutOnComputer =(rnd.nextInt(10));
            System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
            aCompurerHP5 -= cutOnComputer;
            crrictAnser++;
        } else {
            System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
        }}
        System.out.println(aCompurerHP5);
        System.out.println("the timsQusetion is : " + timsOfQuestions + " and crrict anwer is : "+ crrictAnser);
        double parsentag = ((crrictAnser*100/timsOfQuestions) );
        System.out.println("the pursentag :"+ parsentag);
        
        
        
        ///////////////////////////////////  the rely code //////////////////////////////////////////
        
        
        
        String playerName = "player 10";
        int userX5 = 0;
        int ComputerX5 = 0;
        int userY5 = 0;
        int ComputerY5 = 0;
        String anserOfCoin5HT = " ";
        int Tails = 0 ;
        int Heads = 1 ;
        int userHP5 = 100 ;
        int CompurerHP5 = 100 ;
        
        
        
        
        
        
         if (userX5 == ComputerX5 && userY5 == ComputerY5) {  //   if is coming same posation  .
                                        System.out.println("Battle time! ");
                                        System.out.println("Flipping a coin to decide who attacks! ");
                                        
                                        
                                        
                                        
                                         anserOfCoin5HT = " ";
                                int anse2 = (int) (rnd.nextInt(2)); // heads = 1 , tails = 0
                                if (anse2 == 0) {
                                    anserOfCoin5HT = "Tails";
                                } else if (anse2 == 1){
                                    anserOfCoin5HT = "Heads";
                                }
                                System.out.println("Coin flipped and the result is " + anserOfCoin5HT + ".");
                                
                                 if (Tails == anse2 || Heads == anse2) {
                                   System.out.println("Flipped coin: "+anserOfCoin5HT+". "+playerName+" attacks!");
                                    
                                } else {
                                    System.out.println("Flipped coin: "+anserOfCoin5HT+". Computer attacks!");
                                    
                                }
                                
                                        if (Tails == anse2 || Heads == anse2) {
                                        System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                + "incorrectly and you stay on the same spot and wait for your fate!");

                                        int num1 = rnd.nextInt(10);
                                        int num2 = rnd.nextInt(10);
                                        int operationNumber = rnd.nextInt(5) + 1;

                                        String Oprater = " ";
                                        int anser = 0;

                                        switch (operationNumber) {
                                            case 1:
                                                anser = num1 + num2;
                                                Oprater = "+";
                                                break;
                                            case 2:
                                                Oprater = "-";
                                                anser = num1 - num2;
                                                break;
                                            case 3:
                                                Oprater = "*";
                                                anser = num1 * num2;
                                                break;
                                            case 4:
                                                Oprater = "/";
                                                anser = num1 / num2;
                                                break;
                                            case 5:
                                                Oprater = "%";
                                                anser = num1 % num2;
                                                break;
                                        }
                                        System.out.println(num1 + " " + Oprater + " " + num2 + " = ");
                                        timsOfQuestions++;
                                        int userAnswer = in.nextInt();
                                        if (userAnswer == anser) {
                                            int cutOnComputer = (rnd.nextInt(10));
                                            System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                            CompurerHP5 -= cutOnComputer;
                                            crrictAnser++;
                                            userX5 = rnd.nextInt(5);
                                            userY5 = rnd.nextInt(5);
                                        } else {
                                            System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                ComputerX5 = rnd.nextInt(5);
                                                ComputerY5 = rnd.nextInt(5);
                                        }
                                    
                                } else {
                                             int cutOfplayer = (rnd.nextInt(5));
                                            System.out.println("Computer fired a missile and hit the opponent for "
                                                    +cutOfplayer+" HP! Computer is running away to new position.");
                                            userHP5 -= cutOfplayer ;
                                }
                                        
                                    }  //  end  if is coming same posation  .
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
