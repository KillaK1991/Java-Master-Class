public class TeenNumberChecker {

    public static void main(String[] args) {

        // Test Cases used to check the hasTeen method
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }

    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        if ((firstValue >= 13 && firstValue <= 19) || (secondValue >= 13 && secondValue <= 19) || (thirdValue >= 13 && thirdValue <= 19)) {
            return true;
        } else {
            return false;
        }
    }

}