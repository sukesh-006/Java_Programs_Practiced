/*
 * Program Name: StringContainsExample
 * Problem Statement: Check if string contains specific word
 */
// You are using Java
import java.util.*;
class StringContainsExample{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        if(Strong(n)){
            System.out.println("Strong Number");
        }
        else{
              System.out.println("Not Strong Number");
        }   
    }
    static boolean Strong(int n){
       int temp = n;
       int sum = 0;
       while(n>0){
        int rev = n%10;   
        sum =sum + fact(rev);
        n=n/10;
       }
       if(sum==temp){
           return true;
       }
       else{
           return false;
       }
    }
    static int fact(int a){
        int facto=1;
        for(int i = 1;i<=a;i++){
           facto= facto*i;
        }
        return facto;
    }
}