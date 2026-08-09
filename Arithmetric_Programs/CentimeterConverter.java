import java.util.Scanner;

public class CentimeterConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double centimeters = sc.nextDouble();

        double meters = centimeters / 100;
        double kilometers = centimeters / 100000;

        System.out.println("Length in meters = " + meters);
        System.out.println("Length in kilometers = " + kilometers);
        sc.close();
    }
}
