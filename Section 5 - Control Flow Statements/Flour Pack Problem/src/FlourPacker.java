public class FlourPacker {

    public static void main(String[] args){
        //Test Cases for the canPack method
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean fits = true;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else{
            while(goal > 0){
                if(bigCount > 0 && (goal - 5 >= 0)){
                    goal = goal - 5;
                    bigCount--;
                }else if(smallCount > 0 && (goal - 1 >= 0)){
                    goal = goal - 1;
                    smallCount--;
                }else{
                    fits = false;
                    break;
                }
            }
            return fits;
        }
    }
}
