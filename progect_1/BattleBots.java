package progect_1;

import java.util.Scanner;
//import java.util.Random;

/**
 *
 * @author KMNS
 */
public class BattleBots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Random rnd = new Random();
        System.out.println("******************** Welcome to Battle Bots! ********************");
        int repid = 0;
        boolean isPstunned = false;
        boolean isCstuuned = false;

        long startTime = (System.currentTimeMillis() / 1000);  // that for start program.

        String playerName = "player1"; // the ueser name
        String AreaSize = " ";
        do {

            System.out.println("\nPlease select an option: \n"
                    + "1 – Change   your name\n"
                    + "2 – Set game area size\n"
                    + "3 - Start game\n"
                    + "4 – Exit  game");
            int maneOptions = in.nextInt();
            if (maneOptions <= 4) {

                switch (maneOptions) {
                    case 1:
                        System.out.println("Please enter your name: ");
                        playerName = in.next();
                        break;
                    case 2:
                        System.out.println("Please select the game area size:\n"
                                + "A) Game Area: 5x5   max turn: 50\n"
                                + "B) Game Area: 10x10 max turn: 80\n"
                                + "C) Game Area: 15x15 max turn: 100");

                        AreaSize = in.next();

                        break;
                    case 3:

                        switch (AreaSize) {
                            case "A":
                            case "a":
                                int userHP5 = 100;
                                int CompurerHP5 = 100;
                                int userX5 = (int) (Math.random() * 5);
                                int userY5 = (int) (Math.random() * 5);

                                int ComputerX5 = (int) (Math.random() * 5);
                                int ComputerY5 = (int) (Math.random() * 5);
                                long startTime5 = (System.currentTimeMillis() / 1000);
                                int timsOfQuestions5 = 0;
                                int crrictAnser5 = 0;
                                System.out.println("You have selected 5x5 game area size.\n"
                                        + "The initial positions of the robots:\n");

                                System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                        playerName, userX5, userY5, userHP5);
                                System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                        ComputerX5, ComputerY5, CompurerHP5);

                                System.out.println("Heads or Tails?");
                                String HeadTails5 = in.next();
                                int Tails = 5;
                                int Heads = 5;
                                switch (HeadTails5) {
                                    case "Tails":
                                    case "tails":
                                        Tails = 0;
                                        break;
                                    case "Heads":
                                    case "heads":
                                        Heads = 1;
                                        break;
                                }
                                String anserOfCoin5HT = " ";
                                int anse = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                if (anse == 0) {
                                    anserOfCoin5HT = "Tails";
                                } else if (anse == 1) {
                                    anserOfCoin5HT = "Heads";
                                }
                                System.out.println("Coin flipped and the result is " + anserOfCoin5HT + ".");

                                if (Tails == anse || Heads == anse) {
                                    System.out.printf("%s starts first!\n", playerName);

                                } else {
                                    System.out.println(" Computer starts first!");

                                }

                                int i = 1;
                                while (i <= 50 && CompurerHP5 > 0 && userHP5 > 0) {

                                    System.out.println(" ");

                                    if (Tails == anse || Heads == anse) {    // if player is start .

                                        int j = 1;
                                        while (j <= 50) {   // reped if player is start .
                                            if (userX5 == ComputerX5 && userY5 == ComputerY5) {  //   if is coming same posation  .
                                                System.out.println("Battle time! ");
                                                System.out.println("Flipping a coin to decide who attacks! ");

                                                anserOfCoin5HT = " ";
                                                int anse2 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                                if (anse2 == 0) {
                                                    anserOfCoin5HT = "Tails";
                                                } else if (anse2 == 1) {
                                                    anserOfCoin5HT = "Heads";
                                                }
                                                System.out.println("Coin flipped and the result is " + anserOfCoin5HT + ".");

                                                if (Tails == anse2 || Heads == anse2) {
                                                    System.out.println("Flipped coin: " + anserOfCoin5HT + ". " + playerName + " attacks!");

                                                } else {
                                                    System.out.println("Flipped coin: " + anserOfCoin5HT + ". Computer attacks!");

                                                }
                                                if (Tails == anse2 || Heads == anse2) {
                                                    System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                            + "incorrectly and you stay on the same spot and wait for your fate!");

                                                    int num1 = (int) (Math.random() * 10);
                                                    int num2 = (int) (Math.random() * 10);
                                                    int operationNumber = 1 + (int) (Math.random() * 5);

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
                                                    timsOfQuestions5++;
                                                    int userAnswer = in.nextInt();
                                                    if (userAnswer == anser) {
                                                        int cutOnComputer = ((int) (Math.random() * 10));
                                                        System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                                        CompurerHP5 -= cutOnComputer;
                                                        crrictAnser5++;
                                                        userX5 = (int) (Math.random() * 5);
                                                        userY5 = (int) (Math.random() * 5);
                                                        isCstuuned = true;
                                                    } else {
                                                        System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                        ComputerX5 = (int) (Math.random() * 5);
                                                        ComputerY5 = (int) (Math.random() * 5);
                                                        isPstunned = true;
                                                    }

                                                } else {
                                                    int cutOfplayer = ((int) (Math.random() * 10));
                                                    System.out.println("Computer fired a missile and hit the opponent for "
                                                            + cutOfplayer + " HP! Computer is running away to new position.");
                                                    userHP5 -= cutOfplayer;
                                                }

                                            }  //  end  if is coming same posation  . 

                                            if (j % 2 == 0) {

                                                System.out.println("\nTurn " + i);
                                                if (isCstuuned == true) {
                                                    isCstuuned = false;

                                                    System.out.print("It’s computer’s turn.");
                                                    System.out.println(" Computer stays in place to recover this turn.");

                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;

                                                } else {

                                                    System.out.print("It’s computer’s turn.");
                                                    if (isPstunned == true) {
                                                        isPstunned = false;
                                                        System.out.println(" Player stays in place to recover this turn.");
                                                    }
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);
                                                    ComputerX5 = (int) (Math.random() * 5);
                                                    ComputerY5 = (int) (Math.random() * 5);
                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;
                                                }
                                            } else {

                                                System.out.println("\nTurn " + i);
                                                if (isPstunned == true) {
                                                    isPstunned = false;
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    System.out.println(" Player is stunned and cannot move for this turn.");
                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;
                                                } else {
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    if (isCstuuned == true) {
                                                        isCstuuned = false;
                                                        System.out.println("Computer stays in place to recover this turn.");
                                                    }
                                                    userX5 = (int) (Math.random() * 5);
                                                    userY5 = (int) (Math.random() * 5);
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;
                                                }
                                            }

                                        }  // end reped if player is start .

                                    } // end if player start .      
                                    else {  // if computer start .

                                        int j = 1;
                                        while (j <= 50) {  // reped if computer start

                                            if (userX5 == ComputerX5 && userY5 == ComputerY5) {  //   if is coming same posation  .
                                                System.out.println("Battle time! ");
                                                System.out.println("Flipping a coin to decide who attacks! ");

                                                anserOfCoin5HT = " ";
                                                int anse2 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                                if (anse2 == 0) {
                                                    anserOfCoin5HT = "Tails";
                                                } else if (anse2 == 1) {
                                                    anserOfCoin5HT = "Heads";
                                                }
                                                System.out.println("Coin flipped and the result is " + anserOfCoin5HT + ".");

                                                if (Tails == anse2 || Heads == anse2) {
                                                    System.out.println("Flipped coin: " + anserOfCoin5HT + ". " + playerName + " attacks!");

                                                } else {
                                                    System.out.println("Flipped coin: " + anserOfCoin5HT + ". Computer attacks!");

                                                }

                                                if (Tails == anse2 || Heads == anse2) {
                                                    System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                            + "incorrectly and you stay on the same spot and wait for your fate!");

                                                    int num1 = (int) (Math.random() * 10);
                                                    int num2 = (int) (Math.random() * 10);
                                                    int operationNumber = 1 + (int) (Math.random() * 5);

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
                                                    timsOfQuestions5++;
                                                    int userAnswer = in.nextInt();
                                                    if (userAnswer == anser) {
                                                        int cutOnComputer = ((int) (Math.random() * 10));
                                                        System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                                        CompurerHP5 -= cutOnComputer;
                                                        crrictAnser5++;
                                                        userX5 = (int) (Math.random() * 5);
                                                        userY5 = (int) (Math.random() * 5);
                                                    } else {
                                                        System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                        ComputerX5 = (int) (Math.random() * 5);
                                                        ComputerY5 = (int) (Math.random() * 5);
                                                    }

                                                } else {
                                                    int cutOfplayer = ((int) (Math.random() * 5));
                                                    System.out.println("Computer fired a missile and hit the opponent for "
                                                            + cutOfplayer + " HP! Computer is running away to new position.");
                                                    userHP5 -= cutOfplayer;
                                                }

                                            }  //  end  if is coming same posation  .

                                            if (j % 2 == 0) { // computer start playrs saction.
                                                System.out.println("\nTurn " + i);

                                                if (isPstunned == true) {
                                                    isPstunned = false;
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    System.out.println(" Player is stunned and cannot move for this turn.");
                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;
                                                } else {
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    if (isCstuuned == true) {
                                                        System.out.println(" Computer stays in place to recover this turn.");
                                                        isCstuuned = false;

                                                    }
                                                    userX5 = (int) (Math.random() * 5);
                                                    userY5 = (int) (Math.random() * 5);
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;
                                                }

                                            } else { // computer start computer saction.

                                                System.out.println("\nTurn " + i);

                                                if (isCstuuned == true) {
                                                    isCstuuned = false;

                                                    System.out.print("It’s computer’s turn.");
                                                    System.out.println(" Computer stays in place to recover this turn.");

                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;

                                                } else {

                                                    System.out.print("It’s computer’s turn.");
                                                    if (isPstunned == true) {
                                                        System.out.println("Player stays in place to recover this turn.");
                                                        isPstunned = false;

                                                    }
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX5, userY5, userHP5);
                                                    ComputerX5 = (int) (Math.random() * 5);
                                                    ComputerY5 = (int) (Math.random() * 5);
                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX5, ComputerY5, CompurerHP5);
                                                    j++;
                                                    i++;
                                                }

                                            }

                                        } // end reped if computer start .

                                    }       // end if computer start .

                                }

                                if (userHP5 > CompurerHP5) {
                                    System.out.printf("\n********** %s WINS **********\n", playerName);
                                } else if (CompurerHP5 > userHP5) {
                                    System.out.print("\n********** COMPUTER WINS **********\n");
                                } else {
                                    System.out.print("\n********** TIE THE GAME **********\n");
                                }
                                System.out.println("STATISTICS:");
                                System.out.printf("%s\t HP: %d \n", playerName, userHP5);
                                System.out.println("Computer HP: " + CompurerHP5);
                                long LastTime5 = (System.currentTimeMillis() / 1000);
                                long totalScand5 = (LastTime5 - startTime5);
                                System.out.println("Game duration: " + totalScand5 + " seconds");
                                System.out.print(playerName + " answered " + timsOfQuestions5 + " questions ");
                                if (timsOfQuestions5 == 0) {
                                    System.out.println("there is no questions thin is no answered correctly");
                                    //          System.out.println("0 % of them answered correctly.");
                                } else if (timsOfQuestions5 != 0) {
                                    int parsentag = ((crrictAnser5 * 100) / timsOfQuestions5);
                                    System.out.println(parsentag + " % of them answered correctly.");
                                }

                                 {
                                    System.out.println("\n***********************************");
                                }
                                break;

///////////////////////////////////////// 10x10 //////////////////////////////////////////                      
                            case "B":
                            case "b":
                                int userHP10 = 100;
                                int CompurerHP10 = 100;
                                int userX10 = (int) (Math.random() * 10);
                                int userY10 = (int) (Math.random() * 10);
                                int ComputerX10 = (int) (Math.random() * 10);
                                int ComputerY10 = (int) (Math.random() * 10);
                                long startTime10 = (System.currentTimeMillis() / 1000);
                                int timsOfQuestions10 = 0;
                                int crrictAnser10 = 0;
                                System.out.printf("You have selected 10x10 game area size.\n"
                                        + "The initial positions of the robots:\n"
                                        + "%s : ( %d , %d ) HP: 100\n"
                                        + "Computer: ( %d , %d ) HP: 100 \n",
                                        playerName, userX10, userY10,
                                        ComputerX10, ComputerY10);
                                System.out.println("Head or Tails?");
                                String HeadTails10 = in.next();

                                int Tails10 = 5;
                                int Heads10 = 5;
                                switch (HeadTails10) {
                                    case "Tails":
                                    case "tails":
                                        Tails10 = 0;
                                        break;
                                    case "Heads":
                                    case "heads":
                                        Heads10 = 1;
                                        break;
                                }
                                String anserOfCoin10HT = " ";
                                int anse10 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                if (anse10 == 0) {
                                    anserOfCoin10HT = "Tails";
                                } else if (anse10 == 1) {
                                    anserOfCoin10HT = "Heads";
                                }
                                System.out.println("Coin flipped and the result is " + anserOfCoin10HT + ".");

                                if (Tails10 == anse10 || Heads10 == anse10) {
                                    System.out.printf("%s starts first!\n", playerName);

                                } else {
                                    System.out.println(" Computer starts first!");

                                }

                                int i10 = 1;
                                while (i10 <= 80 && CompurerHP10 > 0 && userHP10 > 0) {

                                    System.out.println(" ");

                                    if (Tails10 == anse10 || Heads10 == anse10) {    // if player is start .

                                        int j10 = 1;
                                        while (j10 <= 80) {   // reped if player is start .
                                            if (userX10 == ComputerX10 && userY10 == ComputerY10) {  //   if is coming same posation  .
                                                System.out.println("Battle time! ");
                                                System.out.println("Flipping a coin to decide who attacks! ");

                                                anserOfCoin10HT = " ";
                                                int anse4 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                                if (anse4 == 0) {
                                                    anserOfCoin10HT = "Tails";
                                                } else if (anse4 == 1) {
                                                    anserOfCoin10HT = "Heads";
                                                }
                                                System.out.println("Coin flipped and the result is " + anserOfCoin10HT + ".");

                                                if (Tails10 == anse4 || Heads10 == anse4) {
                                                    System.out.println("Flipped coin: " + anserOfCoin10HT + ". " + playerName + " attacks!");

                                                } else {
                                                    System.out.println("Flipped coin: " + anserOfCoin10HT + ". Computer attacks!");

                                                }
                                                if (Tails10 == anse4 || Heads10 == anse4) {
                                                    System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                            + "incorrectly and you stay on the same spot and wait for your fate!");

                                                    int num1 = (int) (Math.random() * 10);
                                                    int num2 = (int) (Math.random() * 10);
                                                    int operationNumber = 1 + (int) (Math.random() * 5);

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
                                                    timsOfQuestions10++;
                                                    int userAnswer = in.nextInt();
                                                    if (userAnswer == anser) {
                                                        int cutOnComputer = ((int) (Math.random() * 10));
                                                        System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                                        CompurerHP10 -= cutOnComputer;
                                                        crrictAnser10++;
                                                        userX10 = (int) (Math.random() * 10);
                                                        userY10 = (int) (Math.random() * 10);
                                                        isCstuuned = true;
                                                    } else {
                                                        System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                        ComputerX10 = (int) (Math.random() * 10);
                                                        ComputerY10 = (int) (Math.random() * 10);
                                                        isPstunned = true;
                                                    }

                                                } else {
                                                    int cutOfplayer = ((int) (Math.random() * 10));
                                                    System.out.println("Computer fired a missile and hit the opponent for "
                                                            + cutOfplayer + " HP! Computer is running away to new position.");
                                                    userHP10 -= cutOfplayer;
                                                }

                                            }  //  end  if is coming same posation  . 

                                            if (j10 % 2 == 0) {

                                                System.out.println("\nTurn " + i10);
                                                if (isCstuuned == true) {
                                                    isCstuuned = false;

                                                    System.out.print("It’s computer’s turn.");
                                                    System.out.println(" Computer stays in place to recover this turn.");

                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;

                                                } else {

                                                    System.out.print("It’s computer’s turn.");
                                                    if (isPstunned == true) {
                                                        isPstunned = false;
                                                        System.out.println(" Player stays in place to recover this turn.");
                                                    }
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);
                                                    ComputerX10 = (int) (Math.random() * 10);
                                                    ComputerY10 = (int) (Math.random() * 10);
                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;
                                                }
                                            } else {

                                                System.out.println("\nTurn " + i10);
                                                if (isPstunned == true) {
                                                    isPstunned = false;
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    System.out.println(" Player is stunned and cannot move for this turn.");
                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;
                                                } else {
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    if (isCstuuned == true) {
                                                        isCstuuned = false;
                                                        System.out.println("Computer stays in place to recover this turn.");
                                                    }
                                                    userX10 = (int) (Math.random() * 10);
                                                    userY10 = (int) (Math.random() * 10);
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;
                                                }
                                            }

                                        }  // end reped if player is start .

                                    } // end if player start .      
                                    else {  // if computer start .

                                        int j10 = 1;
                                        while (j10 <= 80) {  // reped if computer start

                                            if (userX10 == ComputerX10 && userY10 == ComputerY10) {  //   if is coming same posation  .
                                                System.out.println("Battle time! ");
                                                System.out.println("Flipping a coin to decide who attacks! ");

                                                anserOfCoin10HT = " ";
                                                int anse4 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                                if (anse4 == 0) {
                                                    anserOfCoin10HT = "Tails";
                                                } else if (anse4 == 1) {
                                                    anserOfCoin10HT = "Heads";
                                                }
                                                System.out.println("Coin flipped and the result is " + anserOfCoin10HT + ".");

                                                if (Tails10 == anse4 || Heads10 == anse4) {
                                                    System.out.println("Flipped coin: " + anserOfCoin10HT + ". " + playerName + " attacks!");

                                                } else {
                                                    System.out.println("Flipped coin: " + anserOfCoin10HT + ". Computer attacks!");

                                                }

                                                if (Tails10 == anse4 || Heads10 == anse4) {
                                                    System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                            + "incorrectly and you stay on the same spot and wait for your fate!");

                                                    int num1 = (int) (Math.random() * 10);
                                                    int num2 = (int) (Math.random() * 10);
                                                    int operationNumber = 1 + (int) (Math.random() * 5);

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
                                                    timsOfQuestions10++;
                                                    int userAnswer = in.nextInt();
                                                    if (userAnswer == anser) {
                                                        int cutOnComputer = ((int) (Math.random() * 10));
                                                        System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                                        CompurerHP10 -= cutOnComputer;
                                                        crrictAnser10++;
                                                        userX10 = (int) (Math.random() * 10);
                                                        userY10 = (int) (Math.random() * 10);
                                                    } else {
                                                        System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                        ComputerX10 = (int) (Math.random() * 10);
                                                        ComputerY10 = (int) (Math.random() * 10);
                                                    }

                                                } else {
                                                    int cutOfplayer = ((int) (Math.random() * 10));
                                                    System.out.println("Computer fired a missile and hit the opponent for "
                                                            + cutOfplayer + " HP! Computer is running away to new position.");
                                                    userHP10 -= cutOfplayer;
                                                }

                                            }  //  end  if is coming same posation  .

                                            if (j10 % 2 == 0) { // computer start playrs saction.
                                                System.out.println("\nTurn " + i10);

                                                if (isPstunned == true) {
                                                    isPstunned = false;
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    System.out.println(" Player is stunned and cannot move for this turn.");
                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;
                                                } else {
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    if (isCstuuned == true) {
                                                        System.out.println(" Computer stays in place to recover this turn.");
                                                        isCstuuned = false;

                                                    }
                                                    userX10 = (int) (Math.random() * 10);
                                                    userY10 = (int) (Math.random() * 10);
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;
                                                }

                                            } else { // computer start computer saction.

                                                System.out.println("\nTurn " + i10);

                                                if (isCstuuned == true) {
                                                    isCstuuned = false;

                                                    System.out.print("It’s computer’s turn.");
                                                    System.out.println(" Computer stays in place to recover this turn.");

                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;

                                                } else {

                                                    System.out.print("It’s computer’s turn.");
                                                    if (isPstunned == true) {
                                                        System.out.println("Player stays in place to recover this turn.");
                                                        isPstunned = false;

                                                    }
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX10, userY10, userHP10);
                                                    ComputerX10 = (int) (Math.random() * 10);
                                                    ComputerY10 = (int) (Math.random() * 10);
                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX10, ComputerY10, CompurerHP10);
                                                    j10++;
                                                    i10++;
                                                }

                                            }

                                        } // end reped if computer start .

                                    }       // end if computer start .

                                }

                                if (userHP10 > CompurerHP10) {
                                    System.out.printf("\n********** %s WINS **********\n", playerName);
                                } else if (CompurerHP10 > userHP10) {
                                    System.out.print("\n********** COMPUTER WINS **********\n");
                                } else {
                                    System.out.print("\n********** TIE THE GAME **********\n");
                                }
                                System.out.println("STATISTICS:");
                                System.out.printf("%s\t HP: %d \n", playerName, userHP10);
                                System.out.println("Computer HP: " + CompurerHP10);
                                long LastTime10 = (System.currentTimeMillis() / 1000);
                                long totalScand10 = (LastTime10 - startTime10);
                                System.out.println("Game duration: " + totalScand10 + " seconds");
                                System.out.print(playerName + " answered " + timsOfQuestions10 + " questions ");
                                if (timsOfQuestions10 == 0) {
                                    System.out.println("there is no questions thin is no answered correctly");
                                    //          System.out.println("0 % of them answered correctly.");
                                } else if (timsOfQuestions10 != 0) {
                                    int parsentag = ((crrictAnser10 * 100) / timsOfQuestions10);
                                    System.out.println(parsentag + " % of them answered correctly.");
                                }

                                 {
                                    System.out.println("\n***********************************");
                                }

                                break;
/////////////////////////////////////////////////////////// 15x15 /////////////////////////////////////////////
                            case "C":
                            case "c":
                                int userHP15 = 100;
                                int CompurerHP15 = 100;
                                int userX15 = (int) (Math.random() * 15);
                                int userY15 = (int) (Math.random() * 15);
                                int ComputerX15 = (int) (Math.random() * 15);
                                int ComputerY15 = (int) (Math.random() * 15);
                                long startTime15 = (System.currentTimeMillis() / 1000);
                                int timsOfQuestions15 = 0;
                                int crrictAnser15 = 0;

                                System.out.printf("You have selected 15x15 game area size.\n"
                                        + "The initial positions of the robots:\n");

                                System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                        playerName, userX15, userY15, userHP15);
                                System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                        ComputerX15, ComputerY15, CompurerHP15);

                                System.out.println("Head or Tails?");
                                String HeadTails15 = in.next();

                                int Tails15 = 5;
                                int Heads15 = 5;
                                switch (HeadTails15) {
                                    case "Tails":
                                    case "tails":
                                        Tails15 = 0;
                                        break;
                                    case "Heads":
                                    case "heads":
                                        Heads15 = 1;
                                        break;
                                }
                                String anserOfCoin15HT = " ";
                                int anse15 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                if (anse15 == 0) {
                                    anserOfCoin15HT = "Tails";
                                } else if (anse15 == 1) {
                                    anserOfCoin15HT = "Heads";
                                }
                                System.out.println("Coin flipped and the result is " + anserOfCoin15HT + ".");

                                if (Tails15 == anse15 || Heads15 == anse15) {
                                    System.out.printf("%s starts first!\n", playerName);

                                } else {
                                    System.out.println(" Computer starts first!");

                                }

                                int i15 = 1;
                                while (i15 <= 100 && CompurerHP15 > 0 && userHP15 > 0) {

                                    System.out.println(" ");

                                    if (Tails15 == anse15 || Heads15 == anse15) {    // if player is start .

                                        int j15 = 1;
                                        while (j15 <= 100) {   // reped if player is start .
                                            if (userX15 == ComputerX15 && userY15 == ComputerY15) {  //   if is coming same posation  .
                                                System.out.println("Battle time! ");
                                                System.out.println("Flipping a coin to decide who attacks! ");

                                                anserOfCoin15HT = " ";
                                                int anse8 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                                if (anse8 == 0) {
                                                    anserOfCoin15HT = "Tails";
                                                } else if (anse8 == 1) {
                                                    anserOfCoin15HT = "Heads";
                                                }
                                                System.out.println("Coin flipped and the result is " + anserOfCoin15HT + ".");

                                                if (Tails15 == anse8 || Heads15 == anse8) {
                                                    System.out.println("Flipped coin: " + anserOfCoin15HT + ". " + playerName + " attacks!");

                                                } else {
                                                    System.out.println("Flipped coin: " + anserOfCoin15HT + ". Computer attacks!");

                                                }
                                                if (Tails15 == anse8 || Heads15 == anse8) {
                                                    System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                            + "incorrectly and you stay on the same spot and wait for your fate!");

                                                    int num1 = (int) (Math.random() * 10);
                                                    int num2 = (int) (Math.random() * 10);
                                                    int operationNumber = 1 + (int) (Math.random() * 5);

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
                                                    timsOfQuestions15++;
                                                    int userAnswer = in.nextInt();
                                                    if (userAnswer == anser) {
                                                        int cutOnComputer = ((int) (Math.random() * 10));
                                                        System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                                        CompurerHP15 -= cutOnComputer;
                                                        crrictAnser15++;
                                                        userX15 = (int) (Math.random() * 15);
                                                        userY15 = (int) (Math.random() * 15);
                                                        isCstuuned = true;
                                                    } else {
                                                        System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                        ComputerX15 = (int) (Math.random() * 15);
                                                        ComputerY15 = (int) (Math.random() * 15);
                                                        isPstunned = true;
                                                    }

                                                } else {
                                                    int cutOfplayer = ((int) (Math.random() * 10));
                                                    System.out.println("Computer fired a missile and hit the opponent for "
                                                            + cutOfplayer + " HP! Computer is running away to new position.");
                                                    userHP15 -= cutOfplayer;
                                                }

                                            }  //  end  if is coming same posation  . 

                                            if (j15 % 2 == 0) {

                                                System.out.println("\nTurn " + i15);
                                                if (isCstuuned == true) {
                                                    isCstuuned = false;

                                                    System.out.print("It’s computer’s turn.");
                                                    System.out.println(" Computer stays in place to recover this turn.");

                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;

                                                } else {

                                                    System.out.print("It’s computer’s turn.");
                                                    if (isPstunned == true) {
                                                        isPstunned = false;
                                                        System.out.println(" Player stays in place to recover this turn.");
                                                    }
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);
                                                    ComputerX15 = (int) (Math.random() * 15);
                                                    ComputerY15 = (int) (Math.random() * 15);
                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;
                                                }
                                            } else {

                                                System.out.println("\nTurn " + i15);
                                                if (isPstunned == true) {
                                                    isPstunned = false;
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    System.out.println(" Player is stunned and cannot move for this turn.");
                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;
                                                } else {
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    if (isCstuuned == true) {
                                                        isCstuuned = false;
                                                        System.out.println("Computer stays in place to recover this turn.");
                                                    }
                                                    userX15 = (int) (Math.random() * 15);
                                                    userY15 = (int) (Math.random() * 15);
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;
                                                }
                                            }

                                        }  // end reped if player is start .

                                    } // end if player start .      
                                    else {  // if computer start .

                                        int j15 = 1;
                                        while (j15 <= 100) {  // reped if computer start

                                            if (userX15 == ComputerX15 && userY15 == ComputerY15) {  //   if is coming same posation  .
                                                System.out.println("Battle time! ");
                                                System.out.println("Flipping a coin to decide who attacks! ");

                                                anserOfCoin15HT = " ";
                                                int anse8 = (int) ((int) (Math.random() * 2)); // heads = 1 , tails = 0
                                                if (anse8 == 0) {
                                                    anserOfCoin15HT = "Tails";
                                                } else if (anse8 == 1) {
                                                    anserOfCoin15HT = "Heads";
                                                }
                                                System.out.println("Coin flipped and the result is " + anserOfCoin15HT + ".");

                                                if (Tails15 == anse8 || Heads15 == anse8) {
                                                    System.out.println("Flipped coin: " + anserOfCoin15HT + ". " + playerName + " attacks!");

                                                } else {
                                                    System.out.println("Flipped coin: " + anserOfCoin15HT + ". Computer attacks!");

                                                }

                                                if (Tails15 == anse8 || Heads15 == anse8) {
                                                    System.out.println("Answer the following question correctly to fire a missile against your opponent and run away! Answer\n"
                                                            + "incorrectly and you stay on the same spot and wait for your fate!");

                                                    int num1 = (int) (Math.random() * 10);
                                                    int num2 = (int) (Math.random() * 10);
                                                    int operationNumber = 1 + (int) (Math.random() * 5);

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
                                                    timsOfQuestions15++;
                                                    int userAnswer = in.nextInt();
                                                    if (userAnswer == anser) {
                                                        int cutOnComputer = ((int) (Math.random() * 10));
                                                        System.out.println("Correct! You fired a missile and hit the opponent for " + cutOnComputer + " HP! Player is running away to new position.");
                                                        CompurerHP15 -= cutOnComputer;
                                                        crrictAnser15++;
                                                        userX15 = (int) (Math.random() * 15);
                                                        userY15 = (int) (Math.random() * 15);
                                                    } else {
                                                        System.out.println("Incorrect! The correct result is " + anser + "! You are stunned and cannot move for 1 turn.");
                                                        ComputerX15 = (int) (Math.random() * 15);
                                                        ComputerY15 = (int) (Math.random() * 15);
                                                    }

                                                } else {
                                                    int cutOfplayer = ((int) (Math.random() * 10));
                                                    System.out.println("Computer fired a missile and hit the opponent for "
                                                            + cutOfplayer + " HP! Computer is running away to new position.");
                                                    userHP15 -= cutOfplayer;
                                                }

                                            }  //  end  if is coming same posation  .

                                            if (j15 % 2 == 0) { // computer start playrs saction.
                                                System.out.println("\nTurn " + i15);

                                                if (isPstunned == true) {
                                                    isPstunned = false;
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    System.out.println(" Player is stunned and cannot move for this turn.");
                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;
                                                } else {
                                                    System.out.print("It’s " + playerName + "’s turn.");
                                                    if (isCstuuned == true) {
                                                        System.out.println(" Computer stays in place to recover this turn.");
                                                        isCstuuned = false;

                                                    }
                                                    userX15 = (int) (Math.random() * 15);
                                                    userY15 = (int) (Math.random() * 15);
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;
                                                }

                                            } else { // computer start computer saction.

                                                System.out.println("\nTurn " + i15);

                                                if (isCstuuned == true) {
                                                    isCstuuned = false;

                                                    System.out.print("It’s computer’s turn.");
                                                    System.out.println(" Computer stays in place to recover this turn.");

                                                    System.out.printf(" %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);

                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;

                                                } else {

                                                    System.out.print("It’s computer’s turn.");
                                                    if (isPstunned == true) {
                                                        System.out.println("Player stays in place to recover this turn.");
                                                        isPstunned = false;

                                                    }
                                                    System.out.printf("\n %s\t: ( %d , %d ) HP:%d\n",
                                                            playerName, userX15, userY15, userHP15);
                                                    ComputerX15 = (int) (Math.random() * 15);
                                                    ComputerY15 = (int) (Math.random() * 15);
                                                    System.out.printf("Computer: ( %d , %d ) HP:%d\n",
                                                            ComputerX15, ComputerY15, CompurerHP15);
                                                    j15++;
                                                    i15++;
                                                }

                                            }

                                        } // end reped if computer start .

                                    }       // end if computer start .

                                }

                                if (userHP15 > CompurerHP15) {
                                    System.out.printf("\n********** %s WINS **********\n", playerName);
                                } else if (CompurerHP15 > userHP15) {
                                    System.out.print("\n********** COMPUTER WINS **********\n");
                                } else {
                                    System.out.print("\n********** TIE THE GAME **********\n");
                                }
                                System.out.println("STATISTICS:");
                                System.out.printf("%s\t HP: %d \n", playerName, userHP15);
                                System.out.println("Computer HP: " + CompurerHP15);
                                long LastTime15 = (System.currentTimeMillis() / 1000);
                                long totalScand15 = (LastTime15 - startTime15);
                                System.out.println("Game duration: " + totalScand15 + " seconds");
                                System.out.print(playerName + " answered " + timsOfQuestions15 + " questions ");
                                if (timsOfQuestions15 == 0) {
                                    System.out.println("there is no questions then is no answered correctly");
                                    //        System.out.println("0 % of them answered correctly.");
                                } else if (timsOfQuestions15 != 0) {
                                    int parsentag = ((crrictAnser15 * 100) / timsOfQuestions15);
                                    System.out.println(parsentag + " % of them answered correctly.");

                                }

                                System.out.println("\n***********************************");

                                break;
                            ///////////////////////////////// THE END OF CASE 3 /////////////////////////////////////                                
                        }

                        break;
                    case 4:
                        repid = 5;
                        break;
                }
            }

        } while (repid < 4);
        long LastTime = (System.currentTimeMillis() / 1000);
        System.out.println("The all of time program is " + (LastTime - startTime) + " seconds");

        System.out.println("Good bye!");
    }

}
