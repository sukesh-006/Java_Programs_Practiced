/*
 * Program Name: PrimeNumbersProductToN
 * Problem Statement: Get an N and find the product of all prime numbers up to N
 */
//get an n and find all prime number from n and find product.
import java.util.Scanner;
public class PrimeNumbersProductToN {
 @SuppressWarnings("resource")
 public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    int n = ip.nextInt();
    
    int product = 1;
    for(int i = 1;i<=n;i++){
        int flag=0;
        for(int j = 2;j<i;j++){
            if(i%j==0){
                flag = 1;
                break;
            }
        }
            if(flag==0){
                product*=i;
            }}
            System.out.print(product);
    }
    
 }   

