import java.util.*;
public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) duplicates.add(num);
        }
        return new ArrayList<>(duplicates);
    }
    public static void main(String[] args) {
        System.out.println("Duplicates: " + findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
