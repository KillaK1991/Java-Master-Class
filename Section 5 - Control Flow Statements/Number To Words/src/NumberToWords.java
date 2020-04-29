public class NumberToWords {
    public static void main(String[] args){

        //Test Cases for the numberToWords method
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);


        //Test Cases for the reverse method
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        System.out.println(reverse(1001));
//        System.out.println();

        //Test Cases for the getDigitCount method
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

    }

    public static void numberToWords(int number){
        int totalDigits = 0;
        int numberDigits = 0;
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            totalDigits = getDigitCount(number);
            number = reverse(number);
            numberDigits = String.valueOf(number).length();

            for(int i = number; i > 0; i = i/10){
                int numberToPrint = i % 10;

                switch(numberToPrint){
                    case 0:
                        System.out.print("Zero ");
                        break;

                    case 1:
                        System.out.print("One ");
                        break;

                    case 2:
                        System.out.print("Two ");
                        break;

                    case 3:
                        System.out.print("Three ");
                        break;

                    case 4:
                        System.out.print("Four ");
                        break;

                    case 5:
                        System.out.print("Five ");
                        break;

                    case 6:
                        System.out.print("Six ");
                        break;

                    case 7:
                        System.out.print("Seven ");
                        break;

                    case 8:
                        System.out.print("Eight ");
                        break;

                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
        }
        if(numberDigits < totalDigits){
            int digitDifference = totalDigits - numberDigits;
            while(digitDifference > 0){
                System.out.print("Zero ");
                digitDifference--;
            }
        }

        System.out.println();
    }

    public static int reverse(int number){
        int reverse = 0;
        if(number < 0){
            number = number * -1;
        }
        for(int i = number; i > 0; i = i/10){
            reverse = reverse*10 + i %10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0 ){
            return -1;
        }else{
            String digitCount = String.valueOf(number);
            return digitCount.length();
        }
    }
}
