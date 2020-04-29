public class SumOddRange {
    public static void main(String[] args) {

        // Test Cases used to test the isOdd method
        System.out.println(isOdd(3));
        System.out.println(isOdd(15));
        System.out.println(isOdd(32));
        System.out.println(isOdd(29));

        // Test Cases used to test the sumOdd method
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (end < start || start < 0 || end < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;

                }
            }
            return sum;
        }
    }

}