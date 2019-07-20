import java.util.Scanner;

/**
 * @program CodingExercise24_FlourPackProblem
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 21:07
 */

public class Main {

  private static boolean canPack(int bigCount, int smallCount, int goal)
  {
    int bigCountWeight = 5;
    int smallCountWeight = 1;

    if(bigCount<0||smallCount<0||goal<0)
    {
      return false;
    }

    else
    {
      if((bigCount * bigCountWeight + smallCount * smallCountWeight) >= goal && ((goal%bigCount==0) || (goal%bigCountWeight >= smallCount)))
      {
        return true;
      }
    }

    return false;
  }


  public static void main(String[] args) {

    System.out.println(canPack(1,0,4));

  }
}
    