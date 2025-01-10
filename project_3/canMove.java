package project_3;
import java.util.Scanner;
public class canMove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] playerPositions = new int[2];
        int x = (int) (Math.random() * 7 + 1);
        int y = create_Y(x);
        playerPositions[0] = x ;
        playerPositions[1] = y ;
        System.out.println("Player " + " position: (" + y + "," + x + ")");
        for (int i = 0; i < 10; i++) {
            String move = in.next();
            boolean n = canMove(x, y, move);
            System.out.println(n);
            if (n) {
                movePlayer(playerPositions, move);
                x = playerPositions[0];
                y = playerPositions[1];
            }
            System.out.println("Player " + " position: (" + y + "," + x + ")");
        }
        
        
        
        System.out.println("Player " + " position: (" + y + "," + x + ")");
    }

    
    public static void movePlayer(int[] playerPositions, String move) {
        int playerx = playerPositions[0];
        int playery = playerPositions[1];

        switch (move) {
            case "w": // Up
                playerPositions[1]++;
                break;
            case "s": // Down
                playerPositions[1]--;
                break;
            case "d": // Right
                playerPositions[0]++;
                break;
            case "a": // Left
                playerPositions[0]--;
                break;
        }
    }
    
    
    public static boolean canMove(int x, int y, String move) {
        switch (move) {
            case "w": // Move up
                return ((8 - Math.abs(x - 4)) > (y + 1) && (y + 1) > (Math.abs(x - 4)));
            case "s": // Move down
                return ((8 - Math.abs(x - 4)) > (y - 1) && (y - 1) > (Math.abs(x - 4)));
            case "d": // Move right
                return ((8 - Math.abs((x + 1) - 4)) > y && y > (Math.abs((x + 1) - 4)));
            case "a": // Move left
                return ((8 - Math.abs((x - 1) - 4)) > y && y > (Math.abs((x - 1) - 4))); // y = 3 , 7 > 3 > 1
            default:
                return false;
        }
    }

    public static int create_Y(int random_X) {

        int y = (int) (Math.random() * 7 + 1);
        System.out.println(y);
                    if ((8 - Math.abs(random_X - 4)) > y && y > (Math.abs(random_X - 4))) { // 5 , 
                return y;
            } else {
                return create_Y(random_X);
            }
    }

    

}
