public class MinSubarraySum {
    public static int minSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int min_sum = 0, window_sum = 0;
        for (int i = 0; i < k; i++) window_sum += arr[i];
        min_sum = window_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i - k];
            min_sum = Math.min(min_sum, window_sum);
        }
        return min_sum;
    }
    public static void main(String[] args) {
        System.out.println("Min sum: " + minSum(new int[]{2,1,5,1,3,2}, 3));
    }
}
