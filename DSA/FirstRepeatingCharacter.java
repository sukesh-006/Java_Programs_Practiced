import java.util.HashSet;
import java.util.Set;
public class FirstRepeatingCharacter {
    public static char firstRepeatChar(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.add(c)) return c;
        }
        return '_';
    }
    public static void main(String[] args) {
        System.out.println("First repeating char: " + firstRepeatChar("abccba"));
    }
}
