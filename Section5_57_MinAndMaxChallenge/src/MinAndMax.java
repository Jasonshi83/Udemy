import java.util.Scanner;

import static java.lang.Short.MAX_VALUE;
import static java.lang.Short.MIN_VALUE;

/**
 * @program Section5_57_MinAndMaxChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 20:31
 */

public class MinAndMax {

  private static void MinAndMaxInputChallenge()
  {
    Scanner scanner = new Scanner(System.in);
    //下面为方法1
   /* int min = 0;
    int max = 0;*/

    //方法2,将min和max值设为极小和极大值,并将最大值和最小值颠倒，这样保证第一次输入即可赋值
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;



    //下面为方法1
    /*boolean first = true; //设计boolean flag 用于第一次赋值。在第一次赋值之后把boolean值改为false，这样不会再次赋值。*/


    while(true)
    {
      System.out.println("Enter number");
      if(scanner.hasNextInt())
      {
        int input = scanner.nextInt();


        //下面为方法1
       /* if(first)
        {
          min = input;
          max = input;
          first = false;
        }*/

        if(input<=min)
        {
          min = input;
        }

        if(input>=max)
        {
          max = input;
        }
      }
      else
        break;
    }

    scanner.close();

    System.out.println("Max number input = " + max);
    System.out.println("Min number input = " + min);
  }


  public static void main(String[] args) {

    MinAndMaxInputChallenge();


  }
}
    