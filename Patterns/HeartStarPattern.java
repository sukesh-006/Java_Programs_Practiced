// Heart Star Pattern
//  ***   ***
// ***** *****
// ***********
//  *********
//   *******
//    *****
//     ***
//      *

public class HeartStarPattern {
    public static void main(String[] args) {
        int n = 6;
        // Upper part
        for (int i = n / 2; i <= n; i += 2) {
            // Left bump spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // Left bump stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Gap between bumps
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Right bump stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower inverted pyramid
        for (int i = (2 * n) - 1; i >= 1; i -= 2) {
            for (int j = 1; j <= n - i / 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
