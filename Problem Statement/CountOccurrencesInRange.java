/*
 * Program Name: CountOccurrencesInRange
 * Problem Statement: Calculate total occurrences of a number in a range
 */
import java.util.Scanner;

public class CountOccurrencesInRange {

    // Method to calculate total occurrences of P in the range [L, R]
    public static int getCount(int L, int R, int P) {
        int totalCount = 0;
        
        // Loop through every number in the given range
        for (int i = L; i <= R; i++) {
            totalCount += countFactors(i, P);
        }
        
        return totalCount;
    }

    // Helper method to count how many times P divides a specific number
    public static int countFactors(int num, int P) {
        int localCount = 0;
        
        // Repeatedly divide by P as long as it's perfectly divisible
        while (num % P == 0) {
            localCount++;
            num = num / P;
        }
        
        return localCount;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading inputs
        int L = sc.nextInt();
        int R = sc.nextInt();
        int P = sc.nextInt();
        
        // Get the total count using the required method
        int result = getCount(L, R, P);
        
        // Display the output
        System.out.println(result);
        
        sc.close();
    }
}