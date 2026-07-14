package arrays;
/*
 * Program Name: BinarySearch
 * Problem Statement: Binary search implementation
 */
//Binary search
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] Array = {10,20,30,40,50,60,70};
        int target = 30;
        int result = binarySearch(Array, target);
        System.out.println("Element found at index: " + result); 
    }
}
