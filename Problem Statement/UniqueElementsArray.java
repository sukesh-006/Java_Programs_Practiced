/*
 * Program Name: UniqueElementsArray
 * Problem Statement: Find unique elements in an array using HashSet
 */
import java.util.Scanner;
import java.util.HashSet;

public class UniqueElementsArray {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Variable to store the first repeating element (-1 indicates none found)
        int firstRepeating = -1;
        
        // HashSet to store elements we see as we scan backwards
        HashSet<Integer> seen = new HashSet<>();
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the element is already in the set, it's a repeating element
            if (seen.contains(arr[i])) {
                firstRepeating = arr[i]; 
            } else {
                // Otherwise, add it to the set
                seen.add(arr[i]);
            }
        }
        
        // Print the result according to specifications
        if (firstRepeating != -1) {
            System.out.println("The first repeating element is " + firstRepeating);
        } else {
            System.out.println("There are no repeating elements");
        }
        
        sc.close();
    }
}