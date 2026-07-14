/*
 * Program Name: ReverseNumber
 * Problem Statement: Reverse a Number
 */
// Reverse a Number

// Input an integer and print its reverse (e.g., 123 → 321).
import java.util.Scanner;
public class ReverseNumber {
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner ip= new Scanner(System.in);
        int num = ip.nextInt();
        int rev = 0;
       while(num!=0){
          int rem = num%10;
          rev = rev*10+rem;
          num= num/10;
       }
       System.out.println(rev);
    }
}
