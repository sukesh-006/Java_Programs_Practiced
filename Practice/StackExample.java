/*
 * Program Name: StackExample
 * Problem Statement: Stack push, pop, and peek demonstration
 */
import java.util.Stack;
class StackExample{
    public static void main(String[]args){
        Stack<String>books= new Stack<>();
        books.push("JAVA");
        books.push("Python");
        books.push("C ++");
        books.push("C#");
        books.push("Selenicn");
        books.push("playwright");
        System.out.println("Stack "+books);
        //peek
        System.out.println("TOP BOOKS "+books.peek());
        ///pop
        System.out.println("Removed "+books.pop());
         System.out.println("After "+books);

         //Empty 
          System.out.println("IS Empty "+books.empty());
        //search 
         System.out.println("Position "+books.search("JAVA"));
    }
}