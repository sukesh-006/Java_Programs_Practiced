public class MaxSubarraySum {
    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int max_sum = 0, window_sum = 0;
        for (int i = 0; i < k; i++) window_sum += arr[i];
        max_sum = window_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        System.out.println("Max sum: " + maxSum(new int[]{2,1,5,1,3,2}, 3));
    }
}
