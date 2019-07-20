/**
 * @program CodingExcecise16_firstAndLastDigitSum
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 23:44
 */

public class Main {
  private static int sumFirstAndLastDigit(int number)
  {

    int sum = 0;
   int lastDigit = number % 10;

   //method 1
   /* if(number<0)
    {
      return -1;
    }
    else
    {
      while(number!=0)
      {

        if((number/10)<10&&((number/10)!=0))
        {
          int firstDigit = number / 10;
          sum = lastDigit + firstDigit;
        }

        number /= 10;

      }
      return sum;
    }*/

   //method 2
   int firstNumber = 0;
   while(number>0)
   {
     firstNumber = number;
     number /= 10;

   }
   return(firstNumber+lastDigit);


  }
  public static void main(String[] args) {

    System.out.println(sumFirstAndLastDigit(95557));

  }
}
    