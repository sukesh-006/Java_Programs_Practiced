import java.util.*;
public class ArrayUnion {
    public static int[] union(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) set.add(num);
        for (int num : nums2) set.add(num);
        return set.stream().mapToInt(Number::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println("Union: " + Arrays.toString(union(new int[]{1, 2, 3}, new int[]{2, 3, 4})));
    }
}
