public class PaintJob {
    public static void main(String[] args){
        //Test Cases for the getBucketCount method
//        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        //Test Cases for the getBucketCount method (overloaded)
//        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5));
//        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        //Test Cases for the getBucketCount method (overloaded)
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }else{
            double area = width * height;
            double areaCovered = areaPerBucket * extraBuckets;
            double areaNotCovered = area - areaCovered;
            int neededBuckets = (int) Math.ceil(areaNotCovered/areaPerBucket);
            return neededBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            double area = width * height;
            int neededBuckets = (int) Math.ceil(area/areaPerBucket);
            return neededBuckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            int neededBuckets = (int) Math.ceil(area/areaPerBucket);
            return neededBuckets;
        }
    }
}
