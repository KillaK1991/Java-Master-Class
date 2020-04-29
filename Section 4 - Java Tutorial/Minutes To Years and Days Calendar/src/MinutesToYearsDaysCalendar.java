public class MinutesToYearsDaysCalendar {

    public static void main(String[] args) {
        // Test Cases used to test the printYearsAndDays method
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);


    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesToHours = minutes / 60;
            long hoursToDays = minutesToHours / 24;
            long daysToYears = hoursToDays / 365;
            long remainingDays = hoursToDays % 365;

            System.out.println(minutes + " min = " + daysToYears + " y and " + remainingDays + " d");
        }
    }
}
