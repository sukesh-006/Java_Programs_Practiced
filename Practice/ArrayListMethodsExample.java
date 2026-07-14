/*
 * Program Name: ArrayListMethodsExample
 * Problem Statement: ArrayList methods demonstration
 */

//ArrayList Methods

import java.util.ArrayList;
public class ArrayListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("English");
        books.add("Tamil");
        books.add("Science");
        books.add("Social Science");
        books.add("Maths");
        books.add("Computer Science");

        System.out.println("Books "+ books);
         System.out.println("The Book at index of 3 in "+books.get(3));
        books.set(1,"Python");
        for(String book:books){
            System.out.println(book);
        }
       if(books.contains("java")){
          System.out.println("The java book is there");
       }
       else{
          System.out.println("The java book is not There");
       }

    }
}
