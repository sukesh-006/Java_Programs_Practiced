public class SingleNumber {
    public static int findSingleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Single number: " + findSingleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
