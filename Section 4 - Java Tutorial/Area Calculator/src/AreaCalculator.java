public class AreaCalculator {

    public static void main(String[] args) {

        // Test Cases used to test the area method
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(Math.PI);

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            radius = radius * radius * Math.PI;
            return radius;
        }
    }


    public static double area(double length, double width) {
        if (length < 0 || width < 0) {
            return -1;
        } else {
            double area = length * width;
            return area;
        }
    }

}