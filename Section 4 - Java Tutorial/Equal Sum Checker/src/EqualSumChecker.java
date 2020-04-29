public class EqualSumChecker {

    public static void main(String[] args) {

        // Test Cases used to test the hasEqualSum method
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {
        int sumOfFirstAndSecondValue = firstValue + secondValue;

        if (sumOfFirstAndSecondValue == thirdValue) {
            return true;
        } else {
            return false;
        }
    }

}