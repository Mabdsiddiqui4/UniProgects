package project_3;

import java.util.Scanner;

public class DragonsOrTreasurePart2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Dragons Or Treasure Game Part 2 !\n");
        System.out.println("This game are point is :  ( y , x )");
        System.out.println("Enter the number of players: ");
        int numberOFplayers = in.nextInt();
        int totalEntities = numberOFplayers + 10;
        int[][] positions = new int[totalEntities][2];
        boolean[] reachedEnd = new boolean[numberOFplayers];
        int activePlayers = numberOFplayers;

        for (int index = 0; index < totalEntities; index++) {
            int x, y;
            boolean positionUnique;
            do {
                positionUnique = true;
                x = (int) (Math.random() * 7) + 1;
                y = create_Y(x);

                for (int k = 0; k < index; k++) {
                    if (positions[k][0] == x && positions[k][1] == y) {
                        positionUnique = false;
                        break;
                    }
                }
            } while (!positionUnique);

            positions[index][0] = x;
            positions[index][1] = y;

            if (index < numberOFplayers) {
                System.out.println("Player " + (index + 1) + " position: (" + y + "," + x + ")");
            }
        }

        int[][] playerPositions = new int[numberOFplayers][2];
        for (int i = 0; i < numberOFplayers; i++) {
            playerPositions[i][0] = positions[i][0];
            playerPositions[i][1] = positions[i][1];
        }

        int dragons1x = positions[numberOFplayers][0], dragons1y = positions[numberOFplayers][1];
//        System.out.println("Dragon (1) " + " position: (" + dragons1y + "," + dragons1x + ")");
        int dragons2x = positions[numberOFplayers + 1][0], dragons2y = positions[numberOFplayers + 1][1];
//        System.out.println("Dragon (2) " + " position: (" + dragons2y + "," + dragons2x + ")");
        int dragons3x = positions[numberOFplayers + 2][0], dragons3y = positions[numberOFplayers + 2][1];
//        System.out.println("Dragon (3) " + " position: (" + dragons3y + "," + dragons3x + ")");
        int dragons4x = positions[numberOFplayers + 3][0], dragons4y = positions[numberOFplayers + 3][1];
//        System.out.println("Dragon (4) " + " position: (" + dragons4y + "," + dragons4x + ")");
        int dragons5x = positions[numberOFplayers + 4][0], dragons5y = positions[numberOFplayers + 4][1];
//        System.out.println("Dragon (5) " + " position: (" + dragons5y + "," + dragons5x + ")");
        int traps1x = positions[numberOFplayers + 5][0], traps1y = positions[numberOFplayers + 5][1];
//        System.out.println("trap (1) " + " position: (" + traps1y + "," + traps1x + ")");
        int traps2x = positions[numberOFplayers + 6][0], traps2y = positions[numberOFplayers + 6][1];
//        System.out.println("trap (2) " + " position: (" + traps2y + "," + traps2x + ")");
        int traps3x = positions[numberOFplayers + 7][0], traps3y = positions[numberOFplayers + 7][1];
//        System.out.println("trap (3) " + " position: (" + traps3y + "," + traps3x + ")");
        int EscapeRouteX = positions[numberOFplayers + 8][0], EscapeRouteY = positions[numberOFplayers + 8][1];
//        System.out.println("Escape Route " + " position: (" + EscapeRouteY + "," + EscapeRouteX + ")");
        int RootCliffX = positions[numberOFplayers + 9][0], RootCliffY = positions[numberOFplayers + 9][1];
//       System.out.println("RootCliff " + " position: (" + RootCliffY + "," + RootCliffX + ")");

        int[] playerTreasure = new int[numberOFplayers];
        int[] playerGamepoints = new int[numberOFplayers]; // finish
        int[] playerdragonsBribe = new int[numberOFplayers]; // finch
        int[] playerTrapVisits = new int[numberOFplayers];  // finch

        while (activePlayers > 0) {
            for (int currentPlayer = 0; currentPlayer < numberOFplayers; currentPlayer++) {
                if (reachedEnd[currentPlayer]) {
                    continue;
                }

                boolean validMove = false;
                while (!validMove) {
                    System.out.println("*********************************************");
                    System.out.println("Player " + (currentPlayer + 1) + "'s turn.");
                    int playerx = playerPositions[currentPlayer][0];
                    int playery = playerPositions[currentPlayer][1];
                    System.out.println("Your location is: (" + playery + ", " + playerx + ")");
                    System.out.println("Select your next move (w, s, d, a): ");
                    String move = in.next();

                    
                    validMove = canMove(playerx, playery, move);
                    if (validMove) {
                        movePlayer(playerPositions, currentPlayer, move);
                        playerx = playerPositions[currentPlayer][0];
                        playery = playerPositions[currentPlayer][1];
                        System.out.println("Your new location is: (" + playery + ", " + playerx + ")");
                    } else {
                        System.out.println("Invalid move. Please select a valid position.");
                        continue;
                    }

                    if (isThereATreasure(playerx, playery)) {
                        System.out.println("You found a Treasure! Guess 4 digit Numbers");
                        int userGuess = in.nextInt();
                        if (generate4DigitNum(userGuess)) {
                            playerTreasure[currentPlayer]++;
                            System.out.println("Correct! Treasure count increased to " + playerTreasure[currentPlayer]);
                        } else {
                            System.out.println("Incorrect answer. You didn't get the Treasure.");
                        }
                    }
                     if (isDragon(dragons1x, dragons1y, dragons2x, dragons2y, dragons3x, dragons3y, dragons4x, dragons4y, dragons5x, dragons5y, playerx, playery)) {
                        int dragonBribe = (int) (Math.random() * 5) + 1;
                        System.out.println("You found a Dragon!");
                        if (playerTreasure[currentPlayer] >= dragonBribe) {
                            playerTreasure[currentPlayer] -= dragonBribe;
                            playerGamepoints[currentPlayer] += dragonBribe * 10;
                            System.out.println("Dragon bribe " + dragonBribe + " Treasure. You gained " + dragonBribe * 10 + " game points.");
                        } else {
                            playerGamepoints[currentPlayer] -= dragonBribe * 3;
                            System.out.println("You didn't have enough Treasure for the Dragon. You lost " + dragonBribe * 3 + " game points.");
                        }
                    }
                     if (isTrap(traps1x, traps1y, traps2x, traps2y, traps3x, traps3y, playerx, playery)) {
                        playerGamepoints[currentPlayer] -= 3;
                        System.out.println("You found a trap! You've lost 3 points of Treasure .");
                        System.out.println("Your Treasure points are: " + playerGamepoints[currentPlayer]);
                    }
                     if (isEscapeExit(EscapeRouteX, EscapeRouteY, playerPositions, currentPlayer)) {
                        System.out.println("Player " + (currentPlayer + 1) + " has reached Escape Exit.  (︵‿︵)");
                        reachedEnd[currentPlayer] = true;
                        activePlayers--;
                    } else if (isCliffExit(RootCliffX, RootCliffY, playerPositions, currentPlayer)) {
                        System.out.println("Player " + (currentPlayer + 1) + " has fallen into Cliff Exit.  (●︿●)");
                        reachedEnd[currentPlayer] = true;
                        activePlayers--;
                    }
                     if (activePlayers == 0) {
                        break;
                    }
                }
                 if (activePlayers == 0) {
                    break;
                }  
            }
            
            int winnerIndex = findWinner(playerGamepoints, reachedEnd);
            int TreasureCollectorIndex = findTreasureCollector(playerTreasure);
            int DragonsBribeIndex = findDragonsBribe(playerdragonsBribe);
            int TrapVisitorIndex = findTrapVisitor(playerTrapVisits);

            if (winnerIndex >= 0) {
                System.out.println("Winner: Player " + (winnerIndex + 1));
            } else {
                System.out.println("It's a tie. All players done.");
            }
            System.out.println("Top Treasure Collector: Player " + (TreasureCollectorIndex + 1));
            System.out.println("Top Dragons bribe: Player " + (DragonsBribeIndex + 1));
            System.out.println("Top Trap Visitor: Player " + (TrapVisitorIndex + 1));

        }
    }
    public static int findWinner(int[] gamepoints, boolean[] reachedEnd) {   /////////////
        int maxIndex = -1;
        int maxPoints = 0;
        for (int i = 0; i < gamepoints.length; i++) {
            if (reachedEnd[i] && gamepoints[i] > maxPoints) {
                maxPoints = gamepoints[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int findTreasureCollector(int[] playerTreasure) {    
        int maxIndex = 0;
        int maxCarrots = playerTreasure[0];
        for (int i = 1; i < playerTreasure.length; i++) {
            if (playerTreasure[i] > maxCarrots) {
                maxCarrots = playerTreasure[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int findDragonsBribe(int[] playerdragonsBribe) {     //////////////////
        int maxIndex = 0;
        int maxFeeds = playerdragonsBribe[0];
        for (int i = 1; i < playerdragonsBribe.length; i++) {
            if (playerdragonsBribe[i] > maxFeeds) {
                maxFeeds = playerdragonsBribe[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int findTrapVisitor(int[] playerTrapVisits) {   /////////////////
        int maxIndex = 0;
        int maxVisits = playerTrapVisits[0];
        for (int i = 1; i < playerTrapVisits.length; i++) {
            if (playerTrapVisits[i] > maxVisits) {
                maxVisits = playerTrapVisits[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int create_Y(int random_X) {
         int y = (int) (Math.random() * 7 + 1);
                    if ((8 - Math.abs(random_X - 4)) > y && y > (Math.abs(random_X - 4))) { 
                return y;
            } else {
                return create_Y(random_X);
            }
                    

    
    
    }
    public static void movePlayer(int[][] playerPositions, int currentPlayer, String move) {
        int playerx = playerPositions[currentPlayer][0];
        int playery = playerPositions[currentPlayer][1];

        switch (move) {
            case "w": // Up
                playerPositions[currentPlayer][1]++;
                break;
            case "s": // Down
                playerPositions[currentPlayer][1]--;
                break;
            case "d": // Right
                playerPositions[currentPlayer][0]++;
                break;
            case "a": // Left
                playerPositions[currentPlayer][0]--;
                break;
        }
    }
    public static boolean canMove(int x, int y, String move) {
        switch (move) {
            case "w": // Move up
                return ((8 - Math.abs(x - 4)) > (y+1) && (y+1) > (Math.abs(x - 4)));
            case "s": // Move down
                return ((8 - Math.abs(x - 4)) > (y-1) && (y-1) > (Math.abs(x - 4)));
            case "d": // Move right
                return ((8 - Math.abs((x+1) - 4)) > y && y > (Math.abs((x+1) - 4)));
            case "a": // Move left
                return ((8 - Math.abs((x-1) - 4)) > y && y > (Math.abs((x-1) - 4))); // y = 3 , 7 > 3 > 1
            default:
                return false;
        }
    }
    public static boolean isThereATreasure(int playerx, int playery) {

        return (playerx % 2 != 0 && playery % 2 != 0);

    }
    public static boolean generate4DigitNum(int guessUser) {
        int lotteryNumber = 1000 + (int) (Math.random() * 9000);
        if (guessUser == lotteryNumber) {
            System.out.println("Congrats! You guessed the number!");
        }
        return guessUser == lotteryNumber;
    }
    public static boolean isDragon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x_player, int y_player){
         return (comparison(x1, y1, x_player, y_player) ||
                 comparison(x2, y2, x_player, y_player) ||
                 comparison(x3, y3, x_player, y_player) ||
                 comparison(x4, y4, x_player, y_player) ||
                 comparison(x5, y5, x_player, y_player) );
     }
    public static boolean comparison(int plaseOfcompX , int plaseOfcompY, int x_player, int y_player) {
        return (plaseOfcompX == x_player && plaseOfcompY == y_player);
    }
    public static boolean isTrap(int x1, int y1, int x2, int y2, int x3, int y3, int x_player, int y_player){
         return (comparison(x1, y2, x_player, y_player) ||
                 comparison(x2, y2, x_player, y_player) ||
                 comparison(x3, y3, x_player, y_player) );

    }
    public static boolean isEscapeExit(int x, int y, int[][]playerPositions,int currentPlayer){
        int playerx = playerPositions[currentPlayer][0];
        int playery = playerPositions[currentPlayer][1];
         return (comparison(x, y, playerx, playery));
     }
    public static boolean isCliffExit(int x, int y, int[][]playerPositions,int currentPlayer){
        int playerx = playerPositions[currentPlayer][0];
        int playery = playerPositions[currentPlayer][1];
         return (comparison(x, y, playerx, playery));
     }
}
