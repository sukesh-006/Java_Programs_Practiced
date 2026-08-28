import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Next greater: " + Arrays.toString(nextGreaterElements(new int[]{4, 5, 2, 25})));
    }
}
