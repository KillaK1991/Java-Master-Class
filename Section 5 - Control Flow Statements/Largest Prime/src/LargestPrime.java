public class LargestPrime {
    public static void main(String[] args){
        //Test Cases for the getLargestPrime method
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

        //Test Cases for the isPrime method
        //System.out.println(isPrime(15));

    }

    public static int getLargestPrime(int number){
        int largestPrime = 0;

        if(number < 0 || number == 0 || number ==1){
            return -1;
        }else{
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    if(largestPrime < i && isPrime(i)){
                        largestPrime = i;
                    }
                }
            }
            return largestPrime;
        }
    }

    public static boolean isPrime(int number){
        boolean prime = true;
        for(int i = 2; i < number; i ++){
            if(number % i == 0){
                prime = false;
                return prime;
        }
    }
        return prime;
    }
}
