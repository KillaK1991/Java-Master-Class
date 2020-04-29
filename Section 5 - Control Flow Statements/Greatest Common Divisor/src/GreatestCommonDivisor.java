public class GreatestCommonDivisor {

    public static void main(String[] args){

        //Test Cases for the getGreatestCommonDivisor method
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));


    }

    public static int getGreatestCommonDivisor(int first, int second){
        int lowestValue = 0;
        int highestValue = 0;
        int greatestCommonDivisor = -1;

        if(first < 10 || second < 10){
            return -1;
        }else{
            if(first > second){
                highestValue = first;
                lowestValue = second;
            }else{
                highestValue = second;
                lowestValue = first;
            }

            for(int i = lowestValue; i > 0; i--){
                if(highestValue % i == 0 && lowestValue % i == 0){
                    greatestCommonDivisor = i;
                    break;
                }
            }
        }

        return greatestCommonDivisor;
    }
}
