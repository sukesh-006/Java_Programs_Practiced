import java.util.*;
public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) set.add(num);
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) intersect.add(num);
        }
        return intersect.stream().mapToInt(Number::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println("Intersection: " + Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
