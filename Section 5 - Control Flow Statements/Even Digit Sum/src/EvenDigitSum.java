public class EvenDigitSum {

    public static void main(String[] args){
        //Test Cases for the getEvenDigitSum method
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int sumEven = 0;
        if(number < 0 ){
            return -1;
        }else{
            for(int i = number; i > 0; i = i/10){
                int lastValue = i %10;
                if(lastValue % 2 == 0){
                    sumEven = sumEven + lastValue;
                }
            }
        }
        return sumEven;
    }
}
