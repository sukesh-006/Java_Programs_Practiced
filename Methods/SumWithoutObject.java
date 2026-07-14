/*
 * Program Name: SumWithoutObject
 * Problem Statement: Using methods sum of 2 numbers(without object creation)
 */
import java.util.Scanner;
//using methods sum of 2 numbers(without object creation)
public class SumWithoutObject {
           @SuppressWarnings("resource")
           public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            int a = ip.nextInt();
            int b = ip.nextInt();
            int sum =  solution(a,b);
            System.out.println(sum);
           }
           static int solution(int a,int b){
            int c =a+b;
                return c;
           }
}
