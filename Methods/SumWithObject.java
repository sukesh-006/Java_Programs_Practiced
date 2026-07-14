/*
 * Program Name: SumWithObject
 * Problem Statement: Using methods sum of 2 numbers(with object creation)
 */
import java.util.Scanner;
//using methods sum of 2 numbers(with object creation)
public class SumWithObject {
           @SuppressWarnings("resource")
           public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            int a = ip.nextInt();
            int b = ip.nextInt();
          //  int sum =  solution(a,b);
            SumWithObject k = new SumWithObject();
            System.out.println(k.solution(a, b));
           }
            int solution(int a,int b){
            int c =a+b;
                return c;
           }
}
