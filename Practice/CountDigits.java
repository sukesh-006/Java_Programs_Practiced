/*
 * Program Name: CountDigits
 * Problem Statement: Count Digits in a Number
 */

//3. Count Digits in a Number
import java.util.Scanner;
public class CountDigits {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);{
        int number = ip.nextInt();
        int count=0;
        while (number>0){
            number = number/10;
            count++;
        }
        System.out.println(count);
        }
    }
}
