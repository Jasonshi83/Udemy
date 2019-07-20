/**
 * @program CodingExercise18_SharedDigit
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 12:12
 */

public class Main {

  public static boolean hasSharedDigit(int firstNum, int secondNum)
  {
    if(firstNum >= 10 && firstNum <=99 && secondNum >=10 && secondNum <= 99)
    {
      int firstOfFirst = firstNum % 10;
      int secondOfFirst = firstNum / 10;
      System.out.println(firstOfFirst);
      System.out.println(secondOfFirst);

      while(secondNum!=0)
      {
        int firstOfSecond = secondNum % 10;
        int secondOfSecond = secondNum / 10;
        System.out.println(firstOfSecond);
        System.out.println(secondOfSecond);


        if((firstOfFirst == secondNum % 10) || (secondOfFirst == secondNum /10))
        {
          return true;
        }

        else
        {
          secondNum /= 10;
        }

      }

      return false;
    }

    else
    {
      return false;
    }
  }

  public static void main(String[] args) {

    System.out.println(hasSharedDigit(87,57));

  }
}
    