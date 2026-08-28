public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long left = 1, right = x, result = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int)mid;
            if (mid * mid < x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int)result;
    }
    public static void main(String[] args) {
        System.out.println("Sqrt: " + mySqrt(8));
    }
}
