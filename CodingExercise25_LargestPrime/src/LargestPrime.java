/**
 * @program CodingExercise25_LargestPrime
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 22:06
 */
//求已知数的最大质数factor 217 为31；21为7；45为5；
public class LargestPrime {

  public static int getLargestPrime(int number)
  {
    if(number<=0)
    {
      return -1;
    }
    else
    {
      for (int j = number; j > 1; j--) {
         boolean flag = true;
         for (int i=2; i < j; i++) {
           if(j%i==0)
           {
             flag = false;
           }
         }
         if(number%j==0 && flag==true){
           return j;
         }
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    System.out.println(getLargestPrime(11));

  }
}
    