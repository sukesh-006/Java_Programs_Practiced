/*
 * Program Name: PairSumToTarget
 * Problem Statement: Find pairs in an array that sum to a target value
 */
import java.util.*;
public class PairSumToTarget {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};  
        int target = 6;                
        findPairs(arr, target);
    }
    public static void findPairs(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement); 
                for (int i = 0; i < map.get(complement); i++) {
                    System.out.println("(" + complement + ", " + num + ")");
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Total number of pairs: " + count);
    }
}
