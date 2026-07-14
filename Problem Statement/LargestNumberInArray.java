/*
 * Program Name: LargestNumberInArray
 * Problem Statement: Find the largest number in an array
 */
import java.util.Scanner;

public class LargestNumberInArray {
     @SuppressWarnings("resource")
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //largest number code
        int largest = arr[0];
       for(int i=0;i<=n-1;i++){
         if(arr[i]>largest){
            largest = arr[i];
         }
        }
        System.out.println("LARGEST "+largest);
}
}
