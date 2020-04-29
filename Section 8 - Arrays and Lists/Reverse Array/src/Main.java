public class Main {

    private static int[] firstArray = {2, 5, 6, 8, 10};
    private static int[] secondArray = {3, 2, 4, 8};

    public static void main(String[] args){

        int[] newArray = reverse(firstArray);
        printArray(newArray);

        newArray = reverse(secondArray);
        printArray(newArray);



    }

    public static int[] reverse(int[] array){
        int arrayLength = array.length - 1;
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[arrayLength - i];
            array[arrayLength - i ] = temp;
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
