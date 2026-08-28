$dir = "e:\Java tutorial\CAMP\DSA"
if (-not (Test-Path -Path $dir)) {
    New-Item -ItemType Directory -Force -Path $dir
}

function Create-JavaFile {
    param([string]$Name, [string]$Content)
    $path = "$dir\$Name"
    Set-Content -Path $path -Value $Content
    Write-Host "Created $Name"
}

# 1. Find the largest element in an array
Create-JavaFile -Name "LargestElement.java" -Content @"
public class LargestElement {
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println("Largest element: " + findLargest(arr));
    }
}
"@

# 2. Find the second largest element without sorting
Create-JavaFile -Name "SecondLargest.java" -Content @"
public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        System.out.println("Second largest: " + findSecondLargest(new int[]{12, 35, 1, 10, 34, 1}));
    }
}
"@

# 3. Reverse an array in-place
Create-JavaFile -Name "ReverseArray.java" -Content @"
import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
"@

# 4. Find all duplicate elements in an array
Create-JavaFile -Name "FindDuplicates.java" -Content @"
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
"@

# 5. Move all zeroes to the end while maintaining the order of other elements
Create-JavaFile -Name "MoveZeroes.java" -Content @"
import java.util.Arrays;
public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) arr[index++] = num;
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
"@

# 6. Find the missing number from an array containing numbers from 1 to N
Create-JavaFile -Name "MissingNumber.java" -Content @"
public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        System.out.println("Missing number: " + findMissingNumber(new int[]{1, 2, 4, 5, 6}, 6));
    }
}
"@

# 7. Find the element that appears only once when every other element appears twice
Create-JavaFile -Name "SingleNumber.java" -Content @"
public class SingleNumber {
    public static int findSingleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Single number: " + findSingleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
"@

# 8. Find the intersection of two arrays
Create-JavaFile -Name "ArrayIntersection.java" -Content @"
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
"@

# 9. Find the union of two arrays
Create-JavaFile -Name "ArrayUnion.java" -Content @"
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
"@

# 10. Rotate an array to the right by K positions
Create-JavaFile -Name "RotateArray.java" -Content @"
import java.util.Arrays;
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println("Rotated: " + Arrays.toString(arr));
    }
}
"@

# 11. Check whether a string is a palindrome
Create-JavaFile -Name "PalindromeString.java" -Content @"
public class PalindromeString {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Is palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
    }
}
"@

# 12. Check whether two strings are anagrams
Create-JavaFile -Name "ValidAnagram.java" -Content @"
import java.util.Arrays;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
    public static void main(String[] args) {
        System.out.println("Is anagram: " + isAnagram("anagram", "nagaram"));
    }
}
"@

# 13. Find the first non-repeating character in a string
Create-JavaFile -Name "FirstNonRepeatingCharacter.java" -Content @"
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
"@

# 14. Find the first repeating character in a string
Create-JavaFile -Name "FirstRepeatingCharacter.java" -Content @"
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
"@

# 15. Count the frequency of each character in a string
Create-JavaFile -Name "CharacterFrequency.java" -Content @"
import java.util.HashMap;
import java.util.Map;
public class CharacterFrequency {
    public static void countFrequencies(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        countFrequencies("hello world");
    }
}
"@

# 16. Reverse the words in a sentence without reversing the characters inside each word
Create-JavaFile -Name "ReverseWords.java" -Content @"
public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Reversed words: " + reverseWords("the sky is blue"));
    }
}
"@

# 17. Find the longest word in a sentence
Create-JavaFile -Name "LongestWord.java" -Content @"
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
"@

# 18. Remove duplicate characters from a string
Create-JavaFile -Name "RemoveDuplicateCharacters.java" -Content @"
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
"@

# 19. Check whether one string is a rotation of another string
Create-JavaFile -Name "StringRotation.java" -Content @"
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
"@

# 20. Find the longest substring without repeating characters
Create-JavaFile -Name "LongestSubstringWithoutRepeating.java" -Content @"
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
"@

# 21. Implement linear search
Create-JavaFile -Name "LinearSearch.java" -Content @"
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Index: " + search(new int[]{10, 20, 30, 40}, 30));
    }
}
"@

# 22. Implement binary search on a sorted array
Create-JavaFile -Name "BinarySearch.java" -Content @"
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Index: " + search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
"@

# 23. Find the first and last occurrence of a given element using binary search
Create-JavaFile -Name "FirstAndLastOccurrence.java" -Content @"
import java.util.Arrays;
public class FirstAndLastOccurrence {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    private static int findFirst(int[] nums, int target) {
        int idx = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid - 1;
            else left = mid + 1;
            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }
    private static int findLast(int[] nums, int target) {
        int idx = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }
    public static void main(String[] args) {
        System.out.println("Range: " + Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }
}
"@

# 24. Find the square root of a number using binary search
Create-JavaFile -Name "SquareRoot.java" -Content @"
public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long left = 1, right = x, result = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int)mid;
            if (mid * mid < x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int)result;
    }
    public static void main(String[] args) {
        System.out.println("Sqrt: " + mySqrt(8));
    }
}
"@

# 25. Implement bubble sort
Create-JavaFile -Name "BubbleSort.java" -Content @"
import java.util.Arrays;
public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
"@

Write-Host "Generated first 25 DSA solutions."
