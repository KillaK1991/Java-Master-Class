import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        System.out.println("Please enter 5 numbers");
        int[] arrayOfIntegers = getIntegers(5);
        printArray(arrayOfIntegers);
        arrayOfIntegers = sortIntegers(arrayOfIntegers);
        System.out.println();
        printArray(arrayOfIntegers);

    }

    public static int[] getIntegers(int number){
        int[] integerArray = new int[number];
        for(int i = 0; i < integerArray.length; i++){
            integerArray[i] = scanner.nextInt();
        }
        return integerArray;
    }

    public static void printArray(int[] integerArray){
        System.out.print("Array values ");
        for(int i = 0; i < integerArray.length; i++){
            System.out.print(integerArray[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] integerArray){
        for(int i = 0; i < integerArray.length; i++){
            for(int k = i; k < integerArray.length; k++){
                if(integerArray[k] > integerArray[i]){
                    int temp = integerArray[k];
                    integerArray[k] = integerArray[i];
                    integerArray[i] = temp;
                }
            }
        }
        return integerArray;
    }
}
