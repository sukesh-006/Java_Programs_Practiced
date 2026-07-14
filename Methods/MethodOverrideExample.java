/*
 * Program Name: MethodOverrideExample
 * Problem Statement: Method MethodOverrideExample example
 */
public class MethodOverrideExample{
 static class Btech{
 void introduce(){
 System.out.println("Iam a StudentsClass");
 }
}
static class Rahul extends Btech{
void introduce(){
	System.out.println("Iam a SRIHARAN, Learning JAVA");
}
}
static class Ajay extends Btech{
 void introduce(){
 System.out.println("Iam Ajay, learning Python");
}
}
public static void main(String[] args){
	Btech StringPalindrome = new Rahul();
	StringPalindrome.introduce();
	
	Btech StringAnagram = new Ajay();
	StringAnagram.introduce();

}
}