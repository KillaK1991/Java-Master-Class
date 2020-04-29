import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] integerArray;

    public static void main(String[] args) {
        System.out.println("Please enter a numeric value");
        if (checkUserInput()) {
            integerArray = readIntegers(scanner.nextInt());
            findMin(integerArray);
        } else {
            System.out.println("Ending application because numerica value was not entered");
        }
    }


    public static int[] readIntegers(int sizeOfArray) {
        int count = 0;
        int[] integerArray = new int[sizeOfArray];
        while (count < integerArray.length) {
            System.out.println("Please enter a numeric values");
            if (scanner.hasNextInt()) {
                integerArray[count] = scanner.nextInt();
                count++;
            } else {
                System.out.println("Entered an invalid numeric value");
                scanner.next();
            }
        }
        return integerArray;
    }


    public static boolean checkUserInput() {
        if (scanner.hasNextInt()) {
            return true;
        } else {
            return false;
        }

    }


    public static void findMin(int[] integerArray) {
        int minArrayValue = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (i == 0) {
                minArrayValue = integerArray[i];
            } else if (minArrayValue > integerArray[i]) {
                minArrayValue = integerArray[i];
            }
        }
        System.out.println("Minimum value in the array is " + minArrayValue);
    }
}