public class FirstLastDigitSum {

    public static void main(String[] args){
        //Test Cases for the sumFirstAndLastDigit method
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number){
        int count = 0;
        int lastDigit = 0;
        int firstDigit = 0;

        if(number < 0){
            return -1;
        }else{
            for(int i = number; i > 0; i = i/10){
                if(count == 0){
                    lastDigit = i % 10;
                }
                count++;
                firstDigit = i;
            }
        }
        return firstDigit + lastDigit;
    }
}
