/**
 * @program CodingExercise20_GreatestCommonDivisor
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 13:40
 */

public class Main {

  public static int getGreatestCommonDivisor(int first, int second)
  {
    int greatestCommonDivisor=0;
    if(first<10||second<10)
      return -1;

    else if(first>=10||second>=10)
    {

      for (int i = 1; i <= first; i++) {
        int temp = first%i;
        if(temp==0)
         {
           int temp1 = second%i;
           if(temp1==0)
           {
             greatestCommonDivisor = i;
           }
         }
      }
    }

    return greatestCommonDivisor;
  }


  public static void main(String[] args) {

    System.out.println(getGreatestCommonDivisor(14,30));

  }
}
    