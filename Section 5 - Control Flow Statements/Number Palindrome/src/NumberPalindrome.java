public class NumberPalindrome {
    public static void main(String[] args){

        //Test Cases for the isPalindrome method
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;

        //If Statement used to convert negative numbers into positive numbers
        int originalNumber = number;
        if(number < 0 ){
            originalNumber = originalNumber * -1;
        }

        //For Loop used to reverse the integer value
        for(int i = originalNumber; i > 0; i = i/10){
            reverse = reverse * 10 + (i % 10);
        }

        //If Statement used to compare the passed in value to the reversed value
        if(originalNumber == reverse){
            return true;
        }else{
            return false;
        }
    }
}
