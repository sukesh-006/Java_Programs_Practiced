/*
 * Program Name: CheckPalindromeNumber
 * Problem Statement: Check Palindrome Number
 */
//Check Palindrome Number
import java.util.Scanner;

public class CheckPalindromeNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner ip =  new Scanner(System.in);
        int num = ip.nextInt();
        int num2 = num;
        int rev= 0;
        while(num>0){
        int rem = num%10;
        rev = rev*10+rem;
        num= num/10;
        }
        if(rev==num2){
            System.out.println("The num is palindrome");
        }
        else{
            System.out.println("The num is not palindrome");
        }

    }
}
