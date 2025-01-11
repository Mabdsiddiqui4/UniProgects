package progect_2;

import java.util.Scanner;

public class CreateDiamondShape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
  
        for (int i = 1; i <= (n+1); i++) {
            
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++) {
                    System.out.print("*");
                }
            System.out.println("");
            
            
        }
   
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // this is wronge
        /*     
        int N = n ;
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <= (i); j++) { // you can also change to (i-1)
                System.out.print("*");
            }
            
            for (int j = 1; j <= ((N*2)-1); j++) {
                System.out.print("5");
            }
            N--;
            System.out.println("");
        }
    */
        
        
    }
}
