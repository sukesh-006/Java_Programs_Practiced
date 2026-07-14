/*
 * Program Name: ReverseStringMethod
 * Problem Statement: Reverse a String using methods
 */
//Reverse a String using methods 
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseStringMethod {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i =0; i <n;i++ ){
            arr[i]= ip.nextInt();
        }
        Reverse(arr, n);
    }
    static void Reverse(int []arr,int n ){
        int left = 0;
        int right=arr.length-1;
        
        while(left<right){
     int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
