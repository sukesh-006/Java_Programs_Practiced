import java.util.Arrays;
public class FirstAndLastOccurrence {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    private static int findFirst(int[] nums, int target) {
        int idx = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid - 1;
            else left = mid + 1;
            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }
    private static int findLast(int[] nums, int target) {
        int idx = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }
    public static void main(String[] args) {
        System.out.println("Range: " + Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }
}
