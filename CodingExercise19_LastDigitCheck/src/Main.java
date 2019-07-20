/**
 * @program CodingExercise19_LastDigitCheck
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 13:26
 */

public class Main {

  public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree)
  {
    if((isValid(numberOne)&&isValid(numberTwo)&&isValid(numberThree))== true)
    {
      int numberOneLast = numberOne % 10;
      int numberTwoLast = numberTwo % 10;
      int numberThreeLast = numberThree % 10;

      if(numberOneLast==numberTwoLast||numberOneLast ==numberThreeLast||numberTwoLast ==numberThreeLast)
      {
        return true;
      }
    }
    return false;
  }

  public static boolean isValid(int number)
  {
    if(number>=10&&number<=1000)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(hasSameLastDigit(10,20,43));

  }
}
    