/*
 * Program Name: MultiplicationTable
 * Problem Statement: Print multiplication table up to 10
 */
//Multiplication Table
//Input a number and print its multiplication table up to 10.
import java.util.Scanner;
class MultiplicationTable{
    @SuppressWarnings("resource")
    public static void main( String[]args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int i = 1; i<=10;i++){
            int x= i*n;
            System.out.println(i+"*"+n+"="+x);
        }


        ip.close();

    }
}
