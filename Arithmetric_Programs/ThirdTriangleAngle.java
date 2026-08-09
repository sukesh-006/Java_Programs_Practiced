import java.util.Scanner;

public class ThirdTriangleAngle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        double firstAngle = scan.nextDouble();
        System.out.print("Enter second angle: ");
        double secondAngle = scan.nextDouble();

        double thirdAngle = 180 - firstAngle - secondAngle;
        System.out.println("Third angle = " + thirdAngle);
        scan.close();
    }
}
