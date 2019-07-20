import com.sun.source.doctree.InlineTagTree;

/**
 * @program CodingExercise22_PerfectNumber
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 14:14
 */

public class Main {

  public static boolean isPerfectNumber(int number)
  {
    int sum = 0;
    if(number<1)
    {
      return false;
    }

    else
    {
      for (int i = 1; i < number; i++) {
         if(number % i ==0)
         {
           sum = sum+i;
         }
      }

      if(sum == number)
      {
        return true;
      }

      else
        return false;
    }
  }

  public static void main(String[] args) {

    System.out.println(isPerfectNumber(27));

  }
}
    