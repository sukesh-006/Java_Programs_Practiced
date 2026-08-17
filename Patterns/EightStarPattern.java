// Eight Star Pattern (Figure 8)
//  ***
// *   *
// *   *
//  ***
// *   *
// *   *
//  ***

public class EightStarPattern {
    public static void main(String[] args) {
        int n = 4; // width
        // Top part
        printHorizontalBorder(n);
        printSides(n, 2);
        printHorizontalBorder(n);
        printSides(n, 2);
        printHorizontalBorder(n);
    }

    static void printHorizontalBorder(int n) {
        System.out.print(" ");
        for (int i = 1; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSides(int n, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print("*");
            for (int j = 1; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
