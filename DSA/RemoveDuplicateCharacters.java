import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String s) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        StringBuilder sb = new StringBuilder();
        for (Character c : set) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Without duplicates: " + removeDuplicates("programming"));
    }
}
