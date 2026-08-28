public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;
            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println("Max 1s: " + longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
