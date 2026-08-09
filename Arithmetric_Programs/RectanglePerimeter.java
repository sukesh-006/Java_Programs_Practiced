import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = input.nextDouble();

        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle = " + perimeter);
        input.close();
    }
}
