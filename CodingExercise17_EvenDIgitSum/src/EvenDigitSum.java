/**
 * @program CodingExercise17_EvenDIgitSum
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 12:04
 */

public class EvenDigitSum {

  private static int getEvenDigitSum(int number)
  {
    int sum = 0;

    if(number < 0)
    {
      return -1;
    }

    else
    {
      while(number!=0)
      {
        int temp = number % 10;
        if(temp%2==0)
        {
          sum += temp;
        }
        number = number/10;
      }
    }
    return sum;

  }

  public static void main(String[] args) {

    System.out.println(getEvenDigitSum(123456789));

  }
}
    