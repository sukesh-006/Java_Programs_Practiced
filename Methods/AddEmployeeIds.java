/*
 * Program Name: AddEmployeeIds
 * Problem Statement: Add employee IDs
 */
import java.util.HashSet;

class AddEmployeeIds{
    public static void main(String[] args) {
        HashSet<Integer> employeeids = new HashSet<>();
        //Add employee IDs
        employeeids.add(101);
        employeeids.add(102);
        employeeids.add(103);
        employeeids.add(101); //Duplicate
        employeeids.add(104);
        //Display Unique IDs
        System.out.println("Employees IDs: "+employeeids);
        //Display Count
        System.out.println("Total Unique Employees "+ employeeids.size());
    

    }
}