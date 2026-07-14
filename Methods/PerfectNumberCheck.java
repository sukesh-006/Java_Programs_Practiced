/*
 * Program Name: PerfectNumberCheck
 * Problem Statement: Find the perfect number
 */
//Find the perfect number..
import java .util.Scanner;
public class PerfectNumberCheck {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int num = ip.nextInt();
        boolean per = perfect(num);
        if(per == true){
            System.out.println("the num is perfect");
        }
        else {
            System.out.println("the num is not perfect");
        }
    }
    static boolean perfect(int num){
        int count=0;
            for (int i=1;i<num;i++){
                if (num%i==0){
                    count+=i;
                }
                }
                if(count==num){
                    return true;
                }
                else{
                    return false;
                }
    }
}
