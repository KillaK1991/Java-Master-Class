import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args){
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Please Enter a Number: ");
            boolean isInteger = scanner.hasNextInt();

            if(!isInteger){
                if(min == Integer.MIN_VALUE){
                    System.out.println("You have not entered any values");
                    System.out.println("Minimum Value is -");
                    System.out.println("Maximum Value is -");
                }else{
                    System.out.println("Minimum Value is " + min);
                    System.out.println("Maximum Value is " + max);
                }
                break;
            }else{
                int intValue = scanner.nextInt();
                scanner.nextLine();
                if(min == Integer.MIN_VALUE && max == Integer.MIN_VALUE){
                    min = intValue;
                    max = intValue;
                }else if(min > intValue){
                    min = intValue;
                }else if(max < intValue){
                    max = intValue;
                }
            }
        }
        scanner.close();
    }
}
