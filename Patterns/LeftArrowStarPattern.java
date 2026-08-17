// Left Arrow Star Pattern
//     *****
//    ****
//   ***
//  **
// *
//  **
//   ***
//    ****
//     *****

public class LeftArrowStarPattern {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
