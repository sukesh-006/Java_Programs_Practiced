import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectangle = " + area);
        scanner.close();
    }
}
