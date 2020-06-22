public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets ) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        if(area - (areaPerBucket * extraBuckets) <= 0){
            return 0;
        } else {
            return (int)Math.ceil(((area - (areaPerBucket * extraBuckets)) / areaPerBucket));
        }
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {

        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        return getBucketCount(1, area, areaPerBucket, 0);
    }
}
