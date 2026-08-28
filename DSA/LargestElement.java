public class LargestElement {
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println("Largest element: " + findLargest(arr));
    }
}
