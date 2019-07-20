/**
 * @program Section5_49_SumOdd
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 20:30
 */

public class SumOdd {



  private static boolean isOdd(int number)
  {

    if(number<0)
    {
      return false;
    }

    else if(number%2!=0)
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  private static int sumOdd(int start, int end)
  {
    int sum = 0;
    if(start>=0 && end>=0 && start<=end)
    {
      for (int i =start; i <= end; i++) {
        if(isOdd(i)==true)
        {
          sum += i;
        }
      }
      return sum;
    }

    else
    {
      return -1;
    }

  }


  public static void main(String[] args) {

    System.out.println(sumOdd(1,100));
    System.out.println(sumOdd(-1,100));
    System.out.println(sumOdd(100,100));
    System.out.println(sumOdd(13,13));
    System.out.println(sumOdd(100,-100));
    System.out.println(sumOdd(100,1000));


  }
}
    