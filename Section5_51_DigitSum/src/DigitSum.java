/**
 * @program Section5_51_DigitSum
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 22:10
 */

public class DigitSum {

  private static int sumDigits(int number)
  {
    int sum = 0;
    if(number>=10)
    {
      while(number!=0)
      {
        sum =sum+ number%10;
        number = number/10;//number /= 10;
      }
    }

    else
    {
      return -1;
    }
    return sum;
  }

  public static void main(String[] args) {

    System.out.println(sumDigits(9));

  }
}
    