/*
 * Program Name: FoodDeliveryDiscount
 * Problem Statement: Apply discount for food delivery based on user code
 */
 import java.util.Scanner;
 class FoodDeliveryDiscount {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter your USERCODE:");
            String Str = ip.nextLine();
            int amt = ip.nextInt();
            String str1 = Str.toLowerCase();
            if(str1.equals("drivein20")){
              
                  double discount = amt*(.20);
             double ammt =amt-discount;
            System.out.println(ammt);
            }
           else{
            System.out.println(amt);
           }
            

    }
   
}
