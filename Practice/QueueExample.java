/*
 * Program Name: QueueExample
 * Problem Statement: QueueExample LinkedList example
 */
import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        LinkedList<String>students = new LinkedList<>();
        students.add("RAJU");
        students.add("Vel murugan");
        students.add("Varatharajan");
        students.add("Murugadass");
        students.add("Balusamy");
        System.out.println("The students are "+ students);
        System.out.println("The first value of students "+students.poll());
        students.remove("RAJU");
        System.out.println("The students after removal "+ students);

    }
}
