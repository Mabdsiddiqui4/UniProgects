package progect_2;

import java.util.Scanner;

public class move_player {
    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
        int x_player = (int) (Math.random() * 7);
        int y_player = (int) (Math.random() * 7);
                System.out.println("player is on ("+x_player+","+y_player+")");
       char moveuser = in.next().charAt(0);
        switch (moveuser) {
            case 'w': // Up
                if (y_player > 1) y_player++;
                System.out.println("player is on ("+x_player+","+y_player+")");
                break;
            case 's': // Down
             //   if (y_player < size) playerY++;
                break;
            case 'd': // Right
             //   if (playerX < size) playerX++;
                break;
            case 'a': // Left
              //  if (playerX > 1) playerX--;
                break;
            default:
                System.out.println("Invalid move! Use w, s, d, or a.");
        }
    }
}
