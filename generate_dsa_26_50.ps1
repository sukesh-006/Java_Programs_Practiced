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

# 26. Implement selection sort
Create-JavaFile -Name "SelectionSort.java" -Content @"
import java.util.Arrays;
public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
"@

# 27. Implement insertion sort
Create-JavaFile -Name "InsertionSort.java" -Content @"
import java.util.Arrays;
public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
"@

# 28. Implement merge sort
Create-JavaFile -Name "MergeSort.java" -Content @"
import java.util.Arrays;
public class MergeSort {
    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
"@

# 29. Implement quick sort
Create-JavaFile -Name "QuickSort.java" -Content @"
import java.util.Arrays;
public class QuickSort {
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
"@

# 30. Find the Kth largest element in an unsorted array
Create-JavaFile -Name "KthLargestElement.java" -Content @"
import java.util.PriorityQueue;
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        System.out.println("Kth largest: " + findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}
"@

# 31. Find two numbers in a sorted array whose sum equals a given target
Create-JavaFile -Name "TwoSumSorted.java" -Content @"
import java.util.Arrays;
public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        System.out.println("Indices: " + Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
}
"@

# 32. Find three numbers whose sum is equal to a given target
Create-JavaFile -Name "ThreeSum.java" -Content @"
import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++; right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Triplets: " + threeSum(new int[]{-1,0,1,2,-1,-4}, 0));
    }
}
"@

# 33. Find the maximum sum of any subarray of size K
Create-JavaFile -Name "MaxSubarraySum.java" -Content @"
public class MaxSubarraySum {
    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int max_sum = 0, window_sum = 0;
        for (int i = 0; i < k; i++) window_sum += arr[i];
        max_sum = window_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        System.out.println("Max sum: " + maxSum(new int[]{2,1,5,1,3,2}, 3));
    }
}
"@

# 34. Find the minimum sum of any subarray of size K
Create-JavaFile -Name "MinSubarraySum.java" -Content @"
public class MinSubarraySum {
    public static int minSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int min_sum = 0, window_sum = 0;
        for (int i = 0; i < k; i++) window_sum += arr[i];
        min_sum = window_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i - k];
            min_sum = Math.min(min_sum, window_sum);
        }
        return min_sum;
    }
    public static void main(String[] args) {
        System.out.println("Min sum: " + minSum(new int[]{2,1,5,1,3,2}, 3));
    }
}
"@

# 35. Find the minimum-length subarray whose sum is at least a given target
Create-JavaFile -Name "MinLengthSubarray.java" -Content @"
public class MinLengthSubarray {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0, sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        System.out.println("Min length: " + minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
"@

# 36. Find the longest substring containing at most K distinct characters
Create-JavaFile -Name "LongestSubstringKDistinct.java" -Content @"
import java.util.HashMap;
import java.util.Map;
public class LongestSubstringKDistinct {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println("Max length: " + lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}
"@

# 37. Find the maximum number of consecutive 1s after flipping at most K zeroes
Create-JavaFile -Name "MaxConsecutiveOnes.java" -Content @"
public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;
            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println("Max 1s: " + longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
"@

# 38. Check whether a string containing (), {}, and [] has balanced parentheses
Create-JavaFile -Name "BalancedParentheses.java" -Content @"
import java.util.Stack;
public class BalancedParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Is valid: " + isValid("()[]{}"));
    }
}
"@

# 39. Implement a stack using an array
Create-JavaFile -Name "StackUsingArray.java" -Content @"
public class StackUsingArray {
    private int[] arr;
    private int top;
    private int capacity;
    public StackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        System.out.println("Popped: " + stack.pop());
    }
}
"@

# 40. Implement a queue using an array
Create-JavaFile -Name "QueueUsingArray.java" -Content @"
public class QueueUsingArray {
    private int[] arr;
    private int front, rear, capacity, count;
    public QueueUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0; rear = -1; count = 0;
    }
    public void enqueue(int item) {
        if (count == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
"@

# 41. Find the next greater element for every element in an array
Create-JavaFile -Name "NextGreaterElement.java" -Content @"
import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Next greater: " + Arrays.toString(nextGreaterElements(new int[]{4, 5, 2, 25})));
    }
}
"@

# 42. Evaluate a postfix expression using a stack
Create-JavaFile -Name "EvaluatePostfix.java" -Content @"
import java.util.Stack;
public class EvaluatePostfix {
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (String token : exp.split(" ")) {
            if (token.equals("+")) stack.push(stack.pop() + stack.pop());
            else if (token.equals("-")) { int b = stack.pop(), a = stack.pop(); stack.push(a - b); }
            else if (token.equals("*")) stack.push(stack.pop() * stack.pop());
            else if (token.equals("/")) { int b = stack.pop(), a = stack.pop(); stack.push(a / b); }
            else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println("Result: " + evaluate("2 3 1 * + 9 -"));
    }
}
"@

# 43. Implement a queue using two stacks
Create-JavaFile -Name "QueueUsingStacks.java" -Content @"
import java.util.Stack;
public class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void enqueue(int x) {
        s1.push(x);
    }
    public int dequeue() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) return -1;
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println("Dequeued: " + q.dequeue());
    }
}
"@

# 44. Create a singly linked list and insert a node at the beginning, end, and a given position
Create-JavaFile -Name "LinkedListOperations.java" -Content @"
class ListNode {
    int val; ListNode next;
    ListNode(int val) { this.val = val; }
}
public class LinkedListOperations {
    ListNode head;
    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) { head = newNode; return; }
        ListNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
    public void printList() {
        ListNode tnode = head;
        while (tnode != null) { System.out.print(tnode.val + " "); tnode = tnode.next; }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        list.insertAtEnd(1);
        list.insertAtBeginning(2);
        list.insertAtEnd(3);
        list.printList();
    }
}
"@

# 45. Reverse a singly linked list
Create-JavaFile -Name "ReverseLinkedList.java" -Content @"
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
"@

# 46. Find the middle node of a linked list
Create-JavaFile -Name "MiddleNodeLinkedList.java" -Content @"
public class MiddleNodeLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
"@

# 47. Detect whether a linked list contains a cycle
Create-JavaFile -Name "LinkedListCycle.java" -Content @"
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
"@

# 48. Remove the Nth node from the end of a linked list
Create-JavaFile -Name "RemoveNthNode.java" -Content @"
public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;
        for (int i = 1; i <= n + 1; i++) first = first.next;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
"@

# 49. Generate all permutations of a given string using recursion
Create-JavaFile -Name "StringPermutations.java" -Content @"
public class StringPermutations {
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        permute("ABC", "");
    }
}
"@

# 50. Perform inorder, preorder, and postorder traversal of a binary tree
Create-JavaFile -Name "TreeTraversals.java" -Content @"
class TreeNode {
    int val; TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}
public class TreeTraversals {
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
    public static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.print("Inorder: "); inorder(root); System.out.println();
    }
}
"@

Write-Host "Generated next 25 DSA solutions."
