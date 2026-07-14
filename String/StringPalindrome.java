package String;
/*
 * Program Name: StringPalindrome
 * Problem Statement: Check Palindrome string
 */

import java.util.Scanner;
//Palindrome
public class StringPalindrome {
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        if(palindrome(str)){
            System.out.println("Palindrome");
        }
else{
    System.out.println("Not a Palindrome");
}
String str1 = str.replaceAll(" ","");
System.out.println(str1);
        
    }
    static boolean palindrome(String str){
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
