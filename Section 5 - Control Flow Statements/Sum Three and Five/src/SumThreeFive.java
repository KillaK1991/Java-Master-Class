public class SumThreeFive {

    public static void main(String[] args) {
        int count = 0;
        int totalSum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count = count + 1;
                totalSum = totalSum + i;
                System.out.println("Found number = " + i);
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println(totalSum);
    }

}