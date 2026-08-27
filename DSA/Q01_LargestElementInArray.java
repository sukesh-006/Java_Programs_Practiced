import java.util.Arrays;

public class Q01_LargestElementInArray {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 89, 2};
        int largest = findLargest(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Largest element: " + largest);
    }
}
