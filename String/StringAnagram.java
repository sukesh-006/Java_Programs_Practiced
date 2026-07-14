/*
 * Program Name: StringAnagram
 * Problem Statement: Check String Anagram
 */
//String Anagram
package String;
import java.util.Scanner;
public class StringAnagram {
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        String str1 = ip.nextLine();
        String str2 = ip.nextLine();
        if(Anagram(str1, str2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
        
    }
    static boolean length_check(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        return true;
    }
    static boolean Anagram(String str1,String str2){
        if(length_check(str1,str2)){
            return true;
        }
        return true;
    }
}
