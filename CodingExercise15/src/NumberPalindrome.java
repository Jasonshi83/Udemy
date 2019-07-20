import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @program CodingExercise15
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 22:35
 */

public class NumberPalindrome {
//method 1;
  /*private static boolean isPalindrome(int number)
  {
//    number = Math.abs(number);

    ArrayList<Integer> intArray = new ArrayList<>();

    while(number!=0)
    {
      int temp = number % 10;
      intArray.add(temp);
      number /= 10;
    }

    for (int i = 0; i < intArray.size()/2; i++) {
      if(intArray.get(i)!=intArray.get(intArray.size()-i-1))
      {
        return false;
      }

    }

    return true;

  }*/

  //method 2;
  private static boolean isPalindrome(int number)
  {
    int originalNumber = Math.abs(number);
    int reverse = 0;

    number = Math.abs(number);
    while(number!=0)
    {
      int lastDigit = number % 10;
      reverse = (reverse*10)+lastDigit;
      number /= 10;
    }

    if(originalNumber == reverse)
    {
      return true;
    }


    return false;

  }


  public static void main(String[] args) {

    System.out.println(isPalindrome(-654224516));

  }
}
    