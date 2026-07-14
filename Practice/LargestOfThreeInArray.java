/*
 * Program Name: LargestOfThreeInArray
 * Problem Statement: Find the largest of 3 numbers in array
 */
// Find the largest of 3 numbers in array 
import java.util.*;
public class LargestOfThreeInArray {
    public static void main(String[] args) {
        int [] arr = {99,55,49,87,69,93};
        int x = arr.length;
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=x-1; i>=3;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
