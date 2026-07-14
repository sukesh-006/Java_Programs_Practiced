/*
 * Program Name: SimpleCalculatorSwitch
 * Problem Statement: Simple calculator using switch case for basic operations
 */

import java.util.Scanner;
public class SimpleCalculatorSwitch {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        System.out.println("Select Your Operation");
        System.out.println("Addition 1 \nSubraction 2 \nMultiplication 3 \nDivision 4");
        int n= ip.nextInt();
        switch(n){
            case 1:
                System.out.println(a+b);
            break;
            case 2:
                System.out.println(a-b);
            break;
            case 3:
                System.out.println(a*b);
            break;
            case 4:
                System.out.println(a/b);
            break;
            default:
                System.out.println("Enter a Valid number");

        }
    }
}
