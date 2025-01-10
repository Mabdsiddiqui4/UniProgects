/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progect_1;

import java.util.Scanner;

/**
 *
 * @author KMNS
 */
public class cratenTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start = (System.currentTimeMillis()/1000);
        int wastTime = in.nextInt();
        long last  = (System.currentTimeMillis()/1000);
        
        long time = last - start ;
        System.out.println(time);
    }
}
