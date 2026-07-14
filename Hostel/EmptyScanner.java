/*
 * Program Name: EmptyScanner
 * Problem Statement: Empty scanner implementation
 */
import java.util.Scanner;
public class EmptyScanner {
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        ip.close();
    }
}
