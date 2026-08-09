import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple interest = " + simpleInterest);
        input.close();
    }
}
