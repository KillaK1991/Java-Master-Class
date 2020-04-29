import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;

        for(int i = 1; i < 11; i++){
            System.out.print("Enter number #" + i + ": ");
            boolean enteredValue = scanner.hasNextInt();
            if(!enteredValue){
                System.out.println("Invalid Number");
                i--;
            }else{
                sumOfNumbers = sumOfNumbers + scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println();
        }
        scanner.close();

        System.out.println("Sum of entered numbers are: " + sumOfNumbers);

    }
}
