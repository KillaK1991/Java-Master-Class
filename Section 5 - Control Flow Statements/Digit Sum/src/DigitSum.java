public class DigitSum {
    public static void main(String[] args) {

        // Test cases for the sumDigits method
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(55));


    }

    public static int sumDigits(int number) {
        int sumOfDigit = 0;

        if (number < 10) {
            return -1;
        } else {
            while (number > 0) {
                sumOfDigit = sumOfDigit + number % 10;
                number = number / 10;
            }
            return sumOfDigit;
        }
    }

}
