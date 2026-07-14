/*
 * Program Name: TreeMapPutExample
 * Problem Statement: TreeMap put() method example
 */
import java.util.*;
public class TreeMapPutExample {
    public static void main(String[] args) {
        TreeMap<Integer,String>students = new TreeMap<>();
        //put()
        students.put(101, "Arun");
        students.put(102, "vijay");
        students.put(103,"Karthick");
        students.put(104, "Sri Haran");
        students.put(106, "Vishnu");
        //Display
        System.out.println("TreeMap "+students);
        //get
        System.out.println("StudentsClass with ID 104 "+students.get(104));
        //containskey
        System.out.println("Contains key 102 "+ students.containsKey(102));
        //keySet()
        System.out.println("Keys "+students.keySet());
        //values
        System.out.println("Values "+students.values());
        //entrySet()
        System.out.println("Entries ");
        for(Map.Entry<Integer,String>entry:students.entrySet()){
            System.out.println(entry.getValue());
        }

        //remove
        students.remove(103);
        System.out.println("After Removal key 103 "+students);
        students.clear();
        System.out.println("Cleared "+students);
    }
}
