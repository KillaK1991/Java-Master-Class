public class SharedDigit {

    public static void main(String[] args){
        //Test Cases for the hasSharedDigit method
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int start, int end){
        if( (start < 10 || start > 100) || (end < 10 || end >100) ){
            return false;
        }else{
            int startFirstDigit = start % 10;
            int startSecondDigit = start / 10;
            int endFirstDigit = end % 10;
            int endSecondDigit = end / 10;

            if(startFirstDigit == endFirstDigit || startFirstDigit == endSecondDigit || startSecondDigit == endFirstDigit || startSecondDigit == endSecondDigit){
                return true;
            }
            return false;
        }
    }
}
