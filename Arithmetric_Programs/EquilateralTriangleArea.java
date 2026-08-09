import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of equilateral triangle: ");
        double side = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of equilateral triangle = " + area);
        scanner.close();
    }
}
