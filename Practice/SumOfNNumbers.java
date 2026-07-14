/*
 * Program Name: SumOfNNumbers
 * Problem Statement: Input N and calculate the sum 1 + 2 + ... + N
 */
//Input N and calculate the sum 1 + 2 + 3 + ... + N.
import java.util.Scanner;

public class SumOfNNumbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int aum=0;
        for(int i = 0; i<=n;i++){
             aum+=i;
        }
        System.out.println(aum);
    }
}
