package arrays;
/*
 * Program Name: PrimitiveArrayInput
 * Problem Statement: Read and change primitive arrays
 */
import java.util.Scanner;
public class PrimitiveArrayInput {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //primitive arrays ---> we can change the value
        int n = ip.nextInt();
        int arr[] = new int [n];
        for(int i =0; i<n; i++){
            arr[i] = ip.nextInt();
        } 
        for (int element: arr) {
            System.out.print( element +" ");
        }
        //non primitive arrays --> we can't change the value
        String [] cars = new String[n];
        for(int i =0;i<cars.length;i++){
            cars[i] = ip.nextLine();
                    }
        for(String car: cars){
            System.out.print(car+' ' );
              }
                }

}
