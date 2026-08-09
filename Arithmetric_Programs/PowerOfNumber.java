import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        double answer = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + answer);
        scanner.close();
    }
}
