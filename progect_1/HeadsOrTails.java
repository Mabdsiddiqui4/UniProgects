package progect_1;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        // Heads  or  Tails 
        Scanner in = new Scanner(System.in);
       // int headsTails = (int) (Math.random() * 2); // 1 = heads , 2 = tails
       String playerName = "man";
        Random rnd = new Random();
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
        int anse = (int) (Math.random()*1); // heads = 1 , tails = 0
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

    }
}
