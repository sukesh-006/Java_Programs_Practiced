/*
 * Program Name: EvenDivisibilityCheck
 * Problem Statement: Check if number is even and divisible by 8 or 10
 */
import java.util.Scanner;
public class EvenDivisibilityCheck {
    @SuppressWarnings("resource")
    public static void main (String[] args){
        Scanner ip= new Scanner(System.in);
        int N= ip.nextInt();
        if(N%2==0){
            System.out.println("the n is even");
            if(N%8 ==0|| N%10==0){
                System.out.print("Hi");
            }
            else if(N%12==0 || N%14==0 ){
                System.out.print("Bye");
            }
        }
        else {
            System.out.println("the n is odd");
            if(N%3==0 && N%7==0){
                System.out.println("VSB");
            }
            else if(N%4==0&& N%6==0){
                System.out.println("CBE");
            }
        }
    }
}
