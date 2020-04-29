public class PerfectNumber {

    public static void main(String[] args){
        //Test Cases for the isPerfectNumber method
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        int sumDivisors = 0;
        if(number < 1){
            return false;
        }else{
            for(int i = 1; i < number-1; i++){
                if(number % i == 0){
                    sumDivisors = sumDivisors + i;
                }
            }

            if(sumDivisors == number){
                return true;
            }else{
                return false;
            }
        }
    }
}
