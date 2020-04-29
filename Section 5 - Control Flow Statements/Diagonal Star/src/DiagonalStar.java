public class DiagonalStar {
    public static void main(String[] args){
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(10);

    }

    public static void printSquareStar(int number){
        if(number < 5) {
            System.out.println("Invalid Value");
        }else{
            for(int i = 0; i < number; i++){
                for(int k = 0; k < number; k++){
                    if(i == 0 || i == number - 1){ //First and Last Row
                        System.out.print("*");
                    }else if(k == 0 || k == number -1 ){//Right and Left Column
                        System.out.print("*");
                    }else if(i == k){ //Diagonal Line Right to Left
                        System.out.print("*");
                    }else if(k == (number - i -1)){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
