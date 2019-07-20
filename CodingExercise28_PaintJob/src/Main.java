/**
 * @program CodingExercise28_PaintJob
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 23:54
 */

//Math.ceil Math.floor 方法掌握，overload method掌握

public class Main {

  public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
  {
    int bucketsToBuy = 0;
    if(width<=0 || height <=0 || areaPerBucket<=0||extraBuckets<0)
    {
      return -1;
    }

    else
    {
      bucketsToBuy = (int)Math.ceil((width*height-areaPerBucket*extraBuckets)/areaPerBucket);
    }
    return bucketsToBuy;
  }

  public static int getBucketCount(double width, double height, double areaPerBucket)
  {
    int bucketsToBuy = 0;
    if(width<=0 || height <=0 || areaPerBucket<=0)
    {
      return -1;
    }

    else
    {
      bucketsToBuy =(int)Math.ceil((width*height)/areaPerBucket);
    }
    return bucketsToBuy;
  }

  public static int getBucketCount(double areaPerBucket,double area)
  {
    int bucketsToBuy = 0;
    if(area<=0||areaPerBucket<=0)
    {
      return -1;
    }
    else
    {
      bucketsToBuy = (int)Math.ceil(areaPerBucket/area);
    }
    return bucketsToBuy;

  }

  public static void main(String[] args) {

    System.out.println(getBucketCount(3.4,2.1,1.5,2));
    System.out.println(getBucketCount(2.75,3.25,2.5,1));
    System.out.println(getBucketCount(7.25,4.3,2.35));
    System.out.println(getBucketCount(3.26,0.75));

  }
}
    