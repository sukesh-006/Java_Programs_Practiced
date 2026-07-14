/*
 * Program Name: StudentsClass
 * Problem Statement: StudentsClass class implementation
 */

public class StudentsClass{
void studentsdetails(String name){
		System.out.println("Name "+name);
		System.out.println("**********");
}
void studentsdetails(String name, String course){
	System.out.println("Name "+name);
	System.out.println("Course "+course);
	System.out.println("**********");
}
void studentsdetails(String name,String course,String degree){
	System.out.println("Name "+name);
	System.out.println("Course "+course);
	System.out.println("Degree "+degree);
	System.out.println("*********");
}
public static void main (String[] args){
 StudentsClass a = new StudentsClass();
 a.studentsdetails("Ragul");
 a.studentsdetails("Siva","Java");
 a.studentsdetails("RAJU","python","BTECH");
}
}