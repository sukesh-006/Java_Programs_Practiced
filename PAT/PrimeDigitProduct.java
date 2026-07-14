/*
 * Program Name: PrimeDigitProduct
 * Problem Statement: Find the product of prime digits of a number
 */
import java.util.Scanner;
public class PrimeDigitProduct {
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        int Num = ip.nextInt();
        int product=1;
        while(Num>0){
            int digit= Num%10;
            if(digit==2||digit==3||digit==5||digit==7){
                product*=digit;
            }
            Num=Num/10;
        }
        System.out.println(product);
        ip.close();
    }
}
