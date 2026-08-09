import java.util.Scanner;

public class CircleMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
        scan.close();
    }
}
