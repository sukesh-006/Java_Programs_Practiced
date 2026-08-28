import java.util.HashMap;
import java.util.Map;
public class FirstNonRepeatingCharacter {
    public static char firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1) return c;
        }
        return '_';
    }
    public static void main(String[] args) {
        System.out.println("First unique char: " + firstUniqChar("leetcode"));
    }
}
