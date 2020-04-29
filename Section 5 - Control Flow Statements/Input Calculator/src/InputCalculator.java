import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();


    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;


        while(true){
            boolean isInteger = scanner.hasNextInt();
            if(!isInteger){
                System.out.print("SUM = " + sum + " AVG = " + average);
                break;
            }else{
                count = count + 1;
                int integerValue = scanner.nextInt();
                scanner.nextLine();
                sum = sum + integerValue;
                average = Math.round( (double) sum/count);
            }
        }
        scanner.close();
    }
}
