package arrays;
/*
 * Program Name: LinearSearch
 * Problem Statement: Linear search implementation
 */
//Linear search
public class LinearSearch {
    public static void main (String[]args){
        int [] arr = {10,20,30,40,50,60,};
        int target = 50;
        int result = linear(arr, target);
        System.out.println("Result "+result);
    }
    static int linear(int[]arr, int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1; 
    }
}
