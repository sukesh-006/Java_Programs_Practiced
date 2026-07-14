/*
 * Program Name: FactorialLoop
 * Problem Statement: Calculate factorial using a loop
 */
// Factorial of a Number
// Input a number and calculate its factorial using a loop.
import java.util.Scanner;

public class FactorialLoop {
    @SuppressWarnings("resource")
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int fact=1;
        if(n==0){
            System.out.println("Error , enter a valid number");
        }
        else{
        for (int i=1;i<=n;i++){
            
          fact*=i;
            
        }
    
        System.out.println(fact);}
        
    }
}
