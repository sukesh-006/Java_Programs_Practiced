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
