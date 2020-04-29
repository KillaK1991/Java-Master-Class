public class BarkingDog {

    public static void main(String[] args){

        //Test Cases for the shouldWakeUp method
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else if( (hourOfDay < 8 && barking) || (hourOfDay > 22 && barking) ){
            return true;
        }else{
            return false;
        }
    }
}
