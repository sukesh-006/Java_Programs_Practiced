/*
 * Program Name: AddStudentsToArrayList
 * Problem Statement: Adding students to ArrayList
 */
import java.util.*;
public class AddStudentsToArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        //adding StudentsClass
        students.add("Ragul");
        students.add("Ajay");
        students.add("Kumar");
        students.add("SIVA");
        students.add("arun");
         
        System.out.println("StudentsClass List: "+ students);
        //total students
        System.out.println("TOtal StudentsClass "+ students.size());
        //Get StudentsClass
        System.out.println("StudentsClass at Index 2 "+students.get(2));
         // Update StudentsClass
        students.set(1, "Vijay");
        System.out.println("After Update;"+students);
        //Remove StudentsClass
        students.remove("SIVA");
        System.out.println("After Removal"+students);
        //check StudentsClass exist
        System.out.println("Its Ragul Present in the list? "+students.contains("Ragul"));
        //Display ALL students
        System.out.println("\nStudents Details");
        for(String student:students){
            System.out.println(student);
        }
    }
}
