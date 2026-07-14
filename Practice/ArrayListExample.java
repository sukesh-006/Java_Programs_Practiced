/*
 * Program Name: ArrayListExample
 * Problem Statement: ArrayList add, remove, and contains operations
 */
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[]args){
        ArrayList<String> stuname=new ArrayList<>();
        stuname.add("Sukesh");
        stuname.add("Sri haran");
        stuname.add("Vishnu priyan");
        stuname.add("Vijay");
        stuname.add("Ajith");
        System.out.println("StudentsClass names are :"+stuname);
        System.out.println("Removal of one name "+ stuname.remove(4));
        if(stuname.contains("Sukesh")){
            System.out.println("the name of Sukesh is present");
        }
        else {
            System.out.println("the name of Sukesh is Not present");
        }
    }
}
