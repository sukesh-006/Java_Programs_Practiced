/*
 * Program Name: MethodExample4
 * Problem Statement: Method example 4
 */
import java.util.Scanner;
class MethodExample4{
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        System.out.println("Select the options u need to check the number");
        System.out.println("A. Armstrong number\nB Strong number\nC harshad number");
        String option= ip.nextLine();
        switch(option){
            case "A":
                armstrong(n);
            break;
            case "B":
System.out.println("Enter a Given options");
            break;
            case "C":
System.out.println("Enter a Given options");
            break;
            default:
            System.out.println("Enter a Given options");
        }
    }
    static void armstrong(int n){
        String s = String.valueOf(n);
        int count= s.length();
        int sum=0;
        while(n>0){
            int ld = n%10;
            sum +=Math.pow(ld,count);
            n=n%10;
            }
        if(sum==n){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not a Armstrong");
            }

    }
    
}