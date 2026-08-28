import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), maxLen = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println("Longest substring length: " + lengthOfLongestSubstring("abcabcbb"));
    }
}
