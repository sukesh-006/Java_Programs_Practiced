package arrays;
/*
 * Program Name: ArraySumLoop
 * Problem Statement: Sum of elements in array using loop
 */

public class ArraySumLoop {
    public static void main(String[]args){
   int[] myNum = {10, 20, 30, 40};
    int[] arr2 = {1 ,2, 3 ,4} ;
    int sum=0;
    int sum2 = 0;
    for (int i = 0; i<4;i++){
        sum+=arr2[i];
        sum2+= myNum[i];
    }
    System.out.println(sum);
    System.out.println(sum2);
}
    
}
