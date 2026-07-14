/*
 * Program Name: AddFirstLinkedList
 * Problem Statement: Add first element to LinkedList
 */
import java.util.LinkedList;
public class AddFirstLinkedList {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Ragul");
        students.add("Ajay");
        students.add("Kumar");
        System.out.println("Inital List "+ students);

        //add first 
        students.addFirst("Vijay");
        
    }
}
