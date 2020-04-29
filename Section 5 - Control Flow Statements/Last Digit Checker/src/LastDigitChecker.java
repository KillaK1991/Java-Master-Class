public class LastDigitChecker {

    public static void main(String[] args){
        //Test Cases for the hasSameLastDigit method
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

        //Test Cases for the isValid method
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
            int count = 0;
            firstNumber = firstNumber % 10;
            secondNumber = secondNumber % 10;
            thirdNumber = thirdNumber % 10;

            if(firstNumber == secondNumber){
                count++;
            }else if(firstNumber == thirdNumber){
                count++;
            }else if(thirdNumber == secondNumber){
                count++;
            }
            if(count >= 1){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        }else{
            return false;
        }
    }
}
