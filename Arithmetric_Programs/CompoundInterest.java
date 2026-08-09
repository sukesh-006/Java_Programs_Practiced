import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();
        System.out.print("Enter annual rate of interest: ");
        double rate = input.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double compoundInterest = amount - principal;

        System.out.println("Compound interest = " + compoundInterest);
        System.out.println("Total amount = " + amount);
        input.close();
    }
}
