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
