import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Square root is not a real number.");
        } else {
            System.out.println("Square root = " + Math.sqrt(number));
        }
        sc.close();
    }
}
