/*
 * Program Name: SmartTollCalculation
 * Problem Statement: Calculate toll amount based on vehicle type and weight
 */
import java.util.Scanner;
public class SmartTollCalculation {
@SuppressWarnings("resource")
public static void main(String[] args) {

    
    Scanner ip = new Scanner(System.in);
    String Str = ip.nextLine();
    int weight = ip.nextInt();
    int amt=0;
        if(Str.equals("Car")){
            if(weight<5000){
                amt = 5;
            }
            else{
                amt=7;
            }
        }
        else if (Str.equals("Truck")){
            if(weight<5000){
                amt = 10;
            }
            else{
                amt=12;
            }
        }
        else if (Str.equals("Bus")){
            if(weight<5000){
                amt = 8;
            }
            else{
                amt=10;
            }
        }
        else{
         System.out.println("Vechile Type Not found");
        }
System.out.println(amt);
    
   

}   











}
