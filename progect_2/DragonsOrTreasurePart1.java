package progect_2;
import java.util.Scanner;
public class DragonsOrTreasurePart1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("   ******** Welcome to the Dragons Or Treasure Part(1) Game! ********\n");
        System.out.println("This game are point is :  ( x , y )");
        System.out.print("You start with : \n");
        System.out.print("Treasure    = 0 \n");
        System.out.print("game points = 0 \n");
        System.out.println("the game size is ( 7 ) ");
        int treasure = 0 ; // الكنز الموجود عند اللاعب 
 //        System.out.println("Treasure is = " + treasure);
         
         int dragonsVisited = 0; //  عدد المرات زيارة الديناصور 
  //       System.out.println("number of dragons Visited is = " + dragonsVisited);
         
         int totalGamePoints = 0; // تقاط اللعبة 
   //      System.out.println("the total game points is : " + totalGamePoints);
//////////////////////////////////////////////////////////////////////////////////
//    مواقع الكنز                 
        int Treasure1X = 5;
        int Treasure1Y = 3;
        
        int Treasure2X = 3;
        int Treasure2Y = 3;
        
        int Treasure3X = 5;
        int Treasure3Y = 5;
        
        int Treasure4X = 3;
        int Treasure4Y = 5;
/////////////////////////////////////////////////////////////////////////////////
        //                  موقع الديناصور
        int dragons1x = (int) (Math.random() * 7) + 1;
        int dragons1y = dragonY(dragons1x);
        while(Treasure1X == dragons1x && dragons1y == Treasure1Y || 
              dragons1x == Treasure2X && Treasure2Y == dragons1y ||
              Treasure3X == dragons1x && dragons1y == Treasure3Y ||
              dragons1x == Treasure4X && Treasure4Y == dragons1y  ){
             dragons1x = (int) (Math.random() * 7) + 1;
             Treasure4Y = dragonY(dragons1x);
        }
        
        int dragons2x = (int) (Math.random() * 7) + 1;
        int dragons2y = dragonY(dragons2x);
        while(dragons2x == dragons1x && dragons2y == dragons1y ||
              Treasure1X == dragons2x && dragons2y == Treasure1Y || 
              dragons2x == Treasure2X && Treasure2Y == dragons2y ||
              Treasure3X == dragons2x && dragons2y == Treasure3Y ||
              dragons2x == Treasure4X && Treasure4Y == dragons2y ){
             dragons2x = (int) (Math.random() * 7) + 1;
             dragons2y = dragonY(dragons2x);
        }
    
        int dragons3x = (int) (Math.random() * 7) + 1;
        int dragons3y = dragonY(dragons3x);
        while(dragons3x == dragons1x && dragons3y == dragons1y  ||
              dragons2x == dragons3x && dragons2y == dragons3y  ||
                Treasure1X == dragons3x && dragons3y == Treasure1Y || 
              dragons3x == Treasure2X && Treasure2Y == dragons3y ||
              Treasure3X == dragons3x && dragons3y == Treasure3Y ||
              dragons3x == Treasure4X && Treasure4Y == dragons3y ){
             dragons3x = (int) (Math.random() * 7) + 1;
             dragons3y = dragonY(dragons3x);
        }
        
        int dragons4x = (int) (Math.random() * 7) + 1;
        int dragons4y = dragonY(dragons4x);
         while(dragons4x == dragons1x && dragons4y == dragons1y  ||
              dragons2x == dragons4x && dragons2y == dragons4y||
              dragons4x == dragons3x && dragons4y == dragons3y ||
                 Treasure1X == dragons4x && dragons4y == Treasure1Y || 
              dragons4x == Treasure2X && Treasure2Y == dragons4y ||
              Treasure3X == dragons4x && dragons4y == Treasure3Y ||
              dragons4x == Treasure4X && Treasure4Y == dragons4y ){
              dragons4x = (int) (Math.random() * 7) + 1;
              dragons4y = dragonY(dragons4x);
        }
         
        int dragons5x = (int) (Math.random() * 7) + 1;
        int dragons5y = dragonY(dragons5x);
          while(dragons5x == dragons1x && dragons5y == dragons1y  ||
              dragons2x == dragons5x && dragons2y == dragons5y||
              dragons5x == dragons3x && dragons5y == dragons3y ||
              dragons4x == dragons5x && dragons4y == dragons5y ||
                  Treasure1X == dragons5x && dragons5y == Treasure1Y || 
              dragons5x == Treasure2X && Treasure2Y == dragons5y ||
              Treasure3X == dragons5x && dragons5y == Treasure3Y ||
              dragons5x == Treasure4X && Treasure4Y == dragons5y ){
              dragons5x = (int) (Math.random() * 7) + 1;
             dragons5y = dragonY(dragons5x);
        }
////////////////////////////////////////////////////////////////////////////////////
        //                   موقع القخاخ
        int traps1x = (int) (Math.random() * 7 + 1);
        int traps1y = dragonY(traps1x);
        while(traps1x == dragons1x && traps1y == dragons1y  ||
              dragons2x == traps1x && dragons2y == traps1y||
              traps1x == dragons3x && traps1y == dragons3y ||
              dragons4x == traps1x && dragons4y == traps1y ){
              traps1x = (int) (Math.random() * 7) + 1;
              traps1y = dragonY(traps1x);
        }
        
        int traps2x = (int) (Math.random() * 7 + 1);
        int traps2y = dragonY(traps2x);
        while(traps2x == dragons1x && traps2y == dragons1y  ||
              dragons2x == traps2x && dragons2y == traps2y||
              traps2x == dragons3x && traps2y == dragons3y ||
              dragons4x == traps2x && dragons4y == traps2y ||
              traps1x == traps2x && traps1y == traps2y){
              traps2x = (int) (Math.random() * 7) + 1;
              traps2y = dragonY(traps1x);
        }
        
        int traps3x = (int) (Math.random() * 7 + 1);
        int traps3y = dragonY(traps3x);
         while(traps3x == dragons1x && traps3y == dragons1y  ||
              dragons2x == traps3x && dragons2y == traps3y||
              traps3x == dragons3x && traps3y == dragons3y ||
              dragons4x == traps3x && dragons4y == traps3y ||
              traps1x == traps3x && traps1y == traps3y  ||
              traps3x == traps2x && traps3y == traps2y){
              traps3x = (int) (Math.random() * 7) + 1;
             traps3y = dragonY(traps1x);
        }
/////////////////////////////////////////////////////////////////////////////////        
        //                  موقع المخرج
         int EscapeRouteX = (int) (Math.random() * 7+ 1);
         int EscapeRoutey = dragonY(EscapeRouteX);
         while(EscapeRouteX == dragons1x && EscapeRoutey == dragons1y  ||
              dragons2x == EscapeRouteX && dragons2y == EscapeRoutey||
              EscapeRouteX == dragons3x && EscapeRoutey == dragons3y ||
              dragons4x == EscapeRouteX && dragons4y == EscapeRoutey ||
              traps1x == EscapeRouteX && traps1y == EscapeRoutey  ||
              EscapeRouteX == traps2x && EscapeRoutey == traps2y ||
              traps3x == EscapeRouteX && traps3y == EscapeRoutey  ){
              EscapeRouteX = (int) (Math.random() * 7) + 1;
              EscapeRoutey = dragonY(EscapeRouteX);
        }
         
          int RootCliffX = (int) (Math.random() * 7) +1 ;
          int RootCliffY = dragonY(RootCliffX);
        while(RootCliffX == dragons1x && RootCliffY == dragons1y  ||
              dragons2x == RootCliffX && dragons2y == RootCliffY||
              RootCliffX == dragons3x && RootCliffY == dragons3y ||
              dragons4x == RootCliffX && dragons4y == RootCliffY ||
              traps1x == RootCliffX && traps1y == RootCliffY  ||
              RootCliffX == traps2x && RootCliffY == traps2y ||
              traps3x == RootCliffX && traps3y == RootCliffY ||
              RootCliffX == EscapeRouteX && RootCliffY == EscapeRoutey ){
              RootCliffX = (int) (Math.random() * 7) + 1;
              RootCliffY = dragonY(RootCliffX);
        }
////////////////////////////////////////////////////////////////////////////////////
        
        //                      موقع الاعب
        int x_player = (int) (Math.random() * 7)+1;
        int y_player = dragonY(x_player);
        while(x_player == dragons1x && y_player == dragons1y  ||
              dragons2x == x_player && dragons2y == y_player||
              x_player == dragons3x && y_player == dragons3y ||
              dragons4x == x_player && dragons4y == y_player ||
              traps1x == x_player && traps1y == y_player  ||
              x_player == traps2x && y_player == traps2y ||
              traps3x == x_player && traps3y == y_player ||
              x_player == EscapeRouteX && y_player == EscapeRoutey ||
              RootCliffX == x_player && RootCliffY == y_player){
              x_player = (int) (Math.random() * 7) + 1;
              y_player = dragonY(x_player);
        }
/////////////////////////////////////////////////////////////////////////////////////////
//                               (  x , y ) 
//        System.out.println("dragons1 is on ("+dragons1x+","+dragons1y+")");
//        System.out.println("dragons2 is on ("+dragons2x+","+dragons2y+")");
//        System.out.println("dragons3 is on ("+dragons3x+","+dragons3y+")");
//        System.out.println("dragons4 is on ("+dragons4x+","+dragons4y+")");
//        System.out.println("dragons5 is on ("+dragons5x+","+dragons5y+")");
//        System.out.println("traps1 is on ("+traps1x+","+traps1y+")");
//        System.out.println("traps2 is on ("+traps2x+","+traps2y+")");
//        System.out.println("traps3 is on ("+traps3x+","+traps3y+")");
//        System.out.println("EscapeRoute is on ("+EscapeRouteX+","+EscapeRoutey+")");
//        System.out.println("RootCliff is on ("+RootCliffX+","+RootCliffY+")");
//        System.out.println("player is on ("+x_player+","+y_player+")");
        
          System.out.println("where you want to move : ");
        int move = 0 ;
        int i = 1 ;
        while ((!comparison( EscapeRouteX ,  EscapeRoutey,  x_player,  y_player) && !comparison( RootCliffX , RootCliffY,  x_player, y_player))){
            System.out.println("    ********* Turn (" + i+ ") *********"); i++;
            System.out.println("player is on ("+x_player+","+y_player+")");
   //     System.out.println("Treasure is = " + treasure);
    //    System.out.println("number of dragons Visited is = " + dragonsVisited);
     //   System.out.println("the total game points is : " + totalGamePoints);
            System.out.println("to move user  w: up, s: down, a: right, d: left");
            char moveuser = in.next().charAt(0);
        switch (moveuser) {
            case 'w':  case 'W': // Up
                move = 8;
                if (canMove(x_player,y_player,move)) {
                    y_player++ ;
                }
                break;
            case 's':  case 'S': // Down
                move = 2;
                if (canMove(x_player,y_player,move)) {
                    y_player-- ;
                }   
                break;
            case 'd':  case 'D': // Right
                move = 6;
                if (canMove(x_player,y_player,move)) {
                    x_player++ ;
                }
                break;
            case 'a':  case 'A': // Left
                move = 4;
                if (canMove(x_player,y_player,move)) {
                    x_player-- ;
                }
                break;
            default:
                System.out.println("Invalid move! Use w, s, d, or a.");
                System.out.println("this aea is out of the game");
                continue;
        }
        
            if (isDragon(dragons1x, dragons1y, dragons2x, dragons2y, dragons3x, dragons3y, dragons4x, dragons4y, dragons5x, dragons5y, x_player, y_player)) {
                
                int DragonRandomForBribe = (int) (Math.random() * 10) + 1;
                System.out.print("You bribe the dragon with part of your Treasure, ");
                System.out.println("bribe praise is "+DragonRandomForBribe);
                if (treasure < DragonRandomForBribe) {
                    int losePointRandomForDonthavaEnoughBribe = (int) (Math.random() * 5) + 1;
                    System.out.println("you don't have enough treasure then you lose "+losePointRandomForDonthavaEnoughBribe);
                    totalGamePoints -= losePointRandomForDonthavaEnoughBribe ;
                }else{
                treasure -= DragonRandomForBribe ;
                totalGamePoints += (int) (Math.random() * 5) + 1 ;
                }
            }
            
            if (isTrap(traps1x, traps1y, traps2x, traps2y, traps3x, traps3y, x_player, y_player)) {
                int loseTreasurRandomForTraps = (int) (Math.random() * 10) + 1;
                System.out.println("you are on the Trap then losse " + loseTreasurRandomForTraps + " for Treasur.");
            }
            
            if (isTreasure(Treasure1X, Treasure1Y, x_player, y_player) ||
                isTreasure(Treasure2X, Treasure2Y, x_player, y_player) ||
                isTreasure(Treasure3X, Treasure3Y, x_player, y_player) ||
                isTreasure(Treasure4X, Treasure4Y, x_player, y_player) ){
                System.out.println("you are on the Treasure (-_-)");
                System.out.print("Guess the number for 4 digits : ");
                int guessUser = in.nextInt();
                if (generate4DigitNum(guessUser)) {
                    int inc_Treasure = (int)(Math.random()*20);
                    System.out.println("Correct! Treasure count increased to " + inc_Treasure );
                    treasure += inc_Treasure ;
                    } else {
                    System.out.println("Incorrect answer. You didn't get the Treasure.");
                        }
            }
        
            if (isEscapeExit(EscapeRouteX, EscapeRoutey, x_player, y_player)) {
      //        System.out.println(" Total game points  : " + totalGamePoints);
                System.out.println("The game is done and you is win in the game.(︵‿︵)(^o^)");
                happyEmoge();
            }
            if (isCliffExit(RootCliffX  ,RootCliffY, x_player, y_player)) {
                System.out.println("you now go to cliff door \n the game is done. (●︿●)");
            }
        }
        output(x_player, y_player, treasure, dragonsVisited, totalGamePoints, EscapeRouteX, EscapeRoutey, RootCliffX, RootCliffY, dragons1x, dragons1y, dragons2x, dragons2y, dragons3x, dragons3y, dragons4x, dragons4y, dragons5x, dragons5y, traps1x, traps1y, traps2x, traps2y, traps3x, traps3y);
    }
    
      public static int dragonY(int dragonX) {
        if (dragonX == 1) {
            return 4;
        } else if (dragonX == 2) {
            return 3 + (int) (Math.random() * 3);
        } else if (dragonX == 3) {
            return 2 + (int) (Math.random() * 5);
        } else if (dragonX == 4) {
            return 1 + (int) (Math.random() * 7);
        } else if (dragonX == 5) {
            return 2 + (int) (Math.random() * 5);
        } else if (dragonX == 6) {
            return 3 + (int) (Math.random() * 3);
        } else {
            return 4;
        }
    }
    
    public static boolean cheekingNumber(int X_ofPlayre , int Y_ofPlayre ){
        if (X_ofPlayre == 1) {
            if (Y_ofPlayre == 4 ) {
                 return true;
            }else {
                return false ;
            }
        } else if (X_ofPlayre == 2) {
            if (Y_ofPlayre >= 3 && Y_ofPlayre <= 5 ){
                    return true;
                }else {
                return false ;
            }
            
        } else if (X_ofPlayre == 3) {
            if (Y_ofPlayre >= 2 && Y_ofPlayre <= 6 ){
                    return true;
                }else {
                return false ;
                
            }
        } else if (X_ofPlayre == 4) {
            if (Y_ofPlayre >= 1 && Y_ofPlayre <= 7) {
                    return true;
                }else {
                return false ;
            }
            
        } else if (X_ofPlayre == 5) {
           if (Y_ofPlayre >= 2 && Y_ofPlayre <= 6 ) {
                    return true;
                }else {
                return false ;
           }
           
        } else if (X_ofPlayre == 6) {
            if (Y_ofPlayre >= 3 && Y_ofPlayre <= 5  ){
                    return true;
                }else {
                return false ;
            }
            
        } else {
             if (Y_ofPlayre == 4 ) {
                 return true;
            }else {
                return false ;
            }
        }
    }
    
    public static boolean canMove(int X_ofPlayre , int Y_ofPlayre , int move ){
        switch(move){
            case 8 : // up
                int y_up = (Y_ofPlayre + 1) ;
                if (cheekingNumber(X_ofPlayre,y_up)) {
                    return true;
                }
            break;
            case 2 :
                int y_down = (Y_ofPlayre - 1) ;
                if (cheekingNumber(X_ofPlayre,y_down)) {
                    return true;
                }
            break;
            case 6 :
                int x_rigth = (X_ofPlayre + 1) ;
                if (cheekingNumber(Y_ofPlayre,x_rigth)) {
                    return true;
                } 
            break;
            case 4 :
                int x_lift = (X_ofPlayre - 1) ;
                if (cheekingNumber(Y_ofPlayre,x_lift )) {
                    return true;
                }
            break;
        }
        return false;
        
    }
    
    public static boolean comparison(int plaseOfcompX , int plaseOfcompY, int x_player, int y_player) {
        return (plaseOfcompX == x_player && plaseOfcompY == y_player);
    }
    
    public static int TreasurePlace(int Treasure) {
        if (Treasure % 2 != 0) {
            return Treasure;
        }
        return TreasurePlace((int) (Math.random() * 7));
    }
    
    public static void output(int x_player , int y_player ,int treasure , int dragonsVisited ,
             int totalGamePoints ,int EscapeRouteX , int EscapeRoutey , int RootCliffX , int RootCliffY ,
             int dragons1x ,  int dragons1y ,  int dragons2x , int dragons2y ,
             int dragons3x , int dragons3y ,int dragons4x, int dragons4y ,
                int dragons5x ,int dragons5y , int traps1x , int traps1y ,
                int traps2x , int traps2y , int traps3x , int traps3y ) {  
             System.out.println("player is on ("+x_player+","+y_player+")");
             System.out.println("Treasure is = " + treasure);
             System.out.println("number of dragons Visited is = " + dragonsVisited);
             System.out.println("the total game points is : " + totalGamePoints);
               System.out.println("dragons1 is on ("+dragons1x+","+dragons1y+")");
               System.out.println("dragons2 is on ("+dragons2x+","+dragons2y+")");
               System.out.println("dragons3 is on ("+dragons3x+","+dragons3y+")");
               System.out.println("dragons4 is on ("+dragons4x+","+dragons4y+")");
               System.out.println("dragons5 is on ("+dragons5x+","+dragons5y+")");
               System.out.println("traps1 is on ("+traps1x+","+traps1y+")");
               System.out.println("traps2 is on ("+traps2x+","+traps2y+")");
               System.out.println("traps3 is on ("+traps3x+","+traps3y+")");
}

     public static boolean isDragon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x_player, int y_player){
         return (comparison(x1, y1, x_player, y_player) ||
                 comparison(x2, y2, x_player, y_player) ||
                 comparison(x3, y3, x_player, y_player) ||
                 comparison(x4, y4, x_player, y_player) ||
                 comparison(x5, y5, x_player, y_player) );
     }
     
     public static boolean isTrap(int x1, int y1, int x2, int y2, int x3, int y3, int x_player, int y_player){
         return (comparison(x1, y2, x_player, y_player) ||
                 comparison(x2, y2, x_player, y_player) ||
                 comparison(x3, y3, x_player, y_player) );
     }
     
     public static boolean isEscapeExit(int x, int y, int x_player, int y_player){
         return (comparison(x, y, x_player, y_player));
     }
     
     public static boolean isCliffExit(int x, int y, int x_player, int y_player){
         return (comparison(x, y, x_player, y_player));
     }
     
     public static boolean generate4DigitNum(int guessUser){
         int lotteryNumber = 1000 + (int)(Math.random()*9000);
         
        return guessUser == lotteryNumber ;
     }
     
     public static boolean isTreasure(int x, int y , int x_player, int y_player){
         return (comparison(x, y, x_player, y_player));
     }
      
     public static void happyEmoge(){
         System.out.println(
"    ░░░░░░░░░░░░░░░░░░░░░░█████████\n" +
"    ░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\n" +
"    ░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\n" +
"    ░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
"    ░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\n" +
"    ░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\n" +
"    ░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
"    ░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\n" +
"    ░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\n" +
"    ██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\n" +
"    █▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\n" +
"    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
"    ░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
"    ░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\n" +
"    ░░████████████░░░█████████████████");
            
     }
}