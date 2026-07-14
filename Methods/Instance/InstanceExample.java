package Instance;
/*
 * Program Name: InstanceExample
 * Problem Statement: Instance block example
 */
class InstanceExample{
    String name;
    int age ;
    String course;
     void displayStudentDetails(){
        System.out.println("Student Nme  "+name);
        System.out.println("Student Age  "+age);
        System.out.println("Student Course  "+course);
     }
     public static void main (String []args){
         //object - 1
        InstanceExample StringPalindrome= new InstanceExample();
        StringPalindrome.name ="SUKIIII KUTTYYY";
        StringPalindrome.age = 19;
        StringPalindrome.course = "AIDS";
        StringPalindrome.displayStudentDetails();
     }
}