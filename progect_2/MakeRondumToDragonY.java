package progect_2;

import java.util.Scanner;

public class MakeRondumToDragonY {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //  int Size = in.nextInt();
        int dragons1x = in.nextInt();
        int dragons1y = dragonY(dragons1x);
        System.out.println("the dragons1x is : " + dragons1x);
        System.out.println("the dragons1y is : " + dragons1y);
    }

    public static int dragonY(int dragonX) {
        if (dragonX == 1) {
            return 4 ;
        } else if (dragonX == 2) {
            return 3 + (int) (Math.random() * 3);
        } else if (dragonX == 3) {
            return 2 + (int) (Math.random() * 5);
        } else if (dragonX == 4) {
            return 1 + (int) (Math.random() * 8);
        } else if (dragonX == 5) {
            return 2 + (int) (Math.random() * 5);
        } else if (dragonX == 6) {
            return 3 + (int) (Math.random() * 3);
        } else {
            return 4;
        }
    }

}
