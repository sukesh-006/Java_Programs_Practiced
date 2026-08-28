public class LongestWord {
    public static String findLongestWord(String s) {
        String[] words = s.split("[^a-zA-Z]+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println("Longest word: " + findLongestWord("The quick brown fox jumped over the lazy dog"));
    }
}
