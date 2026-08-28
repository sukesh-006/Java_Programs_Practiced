public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        System.out.println("Missing number: " + findMissingNumber(new int[]{1, 2, 4, 5, 6}, 6));
    }
}
