public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) return false;
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }
    public static void main(String[] args) {
        System.out.println("Is rotation: " + isRotation("waterbottle", "erbottlewat"));
    }
}
