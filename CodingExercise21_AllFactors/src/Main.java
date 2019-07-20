/**
 * @program CodingExercise21_AllFactors
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 14:09
 */

public class Main {

  public static void printFactors(int number)
  {
    if(number<1)
    {
      System.out.println("Invalid Value");
    }
    else
    {
      for (int i = 1; i <= number; i++) {
         if(number % i ==0)
         {
           System.out.println(i);
         }

      }
    }
  }

  public static void main(String[] args) {

    printFactors(10);

  }
}
    