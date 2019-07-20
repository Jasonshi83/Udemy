/**
 * @program CodingExercise23_NumberToWords
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 15:08
 */

public class Main {

  public static void numberToWords(int number)
  {
    String str="";

    if(number<0)
    {
      System.out.println("Invalid Value");
    }

    else
    {
      do
      {
        int temp = number % 10;

        switch(temp)
        {
          case 0:
            str = "Zero " + str;
            break;
          case 1:
            str = "One " + str;
            break;
          case 2:
            str = "Two " + str;
            break;
          case 3:
            str = "Three " + str;
            break;
          case 4:
            str = "Four " + str;
            break;
          case 5:
            str = "Five " + str;
            break;
          case 6:
            str = "Six " + str;
            break;
          case 7:
            str = "Seven " + str;
            break;
          case 8:
            str = "Eight " + str;
            break;
          case 9:
            str = "Nine " + str;
            break;
        }

        number /= 10;
      }while(number !=0);
    }

    System.out.println(str);

  }

  public static int reverse(int number2)
  {
    int reverseNum = 0;

    if(number2>=0)
    {
      while(number2 > 0)
      {
        reverseNum = (reverseNum)*10 + number2%10;
        number2 /= 10;
      }

      return reverseNum;
    }
    else
    {
      int numberTemp = Math.abs(number2);

      while(numberTemp>0)
      {
        reverseNum = (reverseNum)*10 + numberTemp%10;
        numberTemp /= 10;
      }
      return reverseNum*(-1);
    }




  }

  public static int getDigitCount(int number3)
  {
    int count = 0;
    if(number3<0)
    {
      return -1;
    }

    else
    {
      do
      {
        count ++;
        number3 /= 10;
      }while(number3!=0);
    }
    return count;
  }


  public static void main(String[] args) {

    numberToWords(1230);

    System.out.println(getDigitCount(0));

    System.out.println(reverse(-43123));

  }
}
    