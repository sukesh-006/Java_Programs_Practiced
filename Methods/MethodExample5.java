/*
 * Program Name: MethodExample5
 * Problem Statement: Method example 5
 */
import java.util.Scanner;

public class MethodExample5 {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = ip.nextInt();
        
        // Consumes the leftover newline/Enter key from nextInt()
        ip.nextLine(); 
        
        System.out.println("Select the options u need to check the number");
        System.out.println("A. Armstrong number\nB. Strong number\nC. Harshad number");
        String option = ip.nextLine().toUpperCase(); // Converts input to uppercase (handles 'a' or 'A')
        
        switch (option) {
            case "A":
                if (isArmstrong(n)) {
                    System.out.println("Number is an Armstrong number.");
                } else {
                    System.out.println("Number is not an Armstrong number.");
                }
                break;
                
            case "B":
                if (isStrongNum(n)) {
                    System.out.println("Number is a Strong number.");
                } else {
                    System.out.println("Number is not a Strong number.");
                }
                break;
                
            case "C":
                System.out.println("Coding in progress for Harshad number...");
                break;
            
            default:
                System.out.println("Enter only A, B, or C");
                break;
        }
        
        ip.close();
    }
    
    // ==========================================
    // METHOD 1: Armstrong Number Logic
    // ==========================================
    static boolean isArmstrong(int n) {
        String s = String.valueOf(n);
        int original = n;
        int count = s.length();
        int sum = 0;
        
        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, count);
            n = n / 10; // Divided by 10 to drop the last digit
        }
        
        return sum == original;
    }
    
    // ==========================================
    // METHOD 2: Strong Number Logic
    // ==========================================
    static boolean isStrongNum(int n) {
        int sum = 0;
        int temp = n;
        
        while (n > 0) {
            int digit = n % 10;
            sum += facto(digit);
            n = n / 10; // Divided by 10 to drop the last digit
        }
        
        return sum == temp;
    }
    
    // Helper method for Factorial
    static int facto(int n) {
        int facto = 1;
        // 0! is 1, so the loop automatically skips for 0 and returns 1
        for (int i = 1; i <= n; i++) {
            facto *= i;  
        }    
        return facto;
    }
}