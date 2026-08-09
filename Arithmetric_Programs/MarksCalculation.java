import java.util.Scanner;

public class MarksCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int subject = 1; subject <= 5; subject++) {
            System.out.print("Enter marks for subject " + subject + ": ");
            total = total + sc.nextDouble();
        }

        double average = total / 5;
        double percentage = total / 5; // Each subject is out of 100.

        System.out.println("Total marks = " + total);
        System.out.println("Average marks = " + average);
        System.out.println("Percentage = " + percentage + "%");
        sc.close();
    }
}
