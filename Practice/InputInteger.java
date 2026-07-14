/*
 * Program Name: InputInteger
 * Problem Statement: Input integer using Scanner
 */

import java.util.Scanner;

public class InputInteger {
    @SuppressWarnings("resource")
    public static void main(String[] args){
            
        Scanner ip = new Scanner(System.in);
        // int n= ip.nextInt();
        // double sq= Math.pow(n,2);
        // double cu = Math.pow(n,3);
        // System.out.println(sq);
        // System.out.println(cu);
            
        int n = ip.nextInt();
        //int m = ip.nextInt();

        // if(n%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("ODD");
        // }
        // if(n>n){
        //     System.out.println(n);
        // }
        // else{
        //     System.out.println(m);
        // }
        if(n>0){
            System.out.print("Positive");

        }
        else if (n<0){
            System.out.println("Negative");

        }
        else{
            System.out.println("Zero");
        }
        ip.close();

    }
}
