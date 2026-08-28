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
