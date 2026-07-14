/*
 * Program Name: ReverseArray
 * Problem Statement: Reverse elements in an array
 */
import java.util.Scanner;
public class ReverseArray {
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= ip.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}

    }
}
