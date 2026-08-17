// Plus Star Pattern
//     +
//     +
//     +
// + + + + + + + + +
//     +
//     +
//     +

public class PlusStarPattern {
    public static void main(String[] args) {
        int n = 5; // n should be odd for symmetric plus
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
