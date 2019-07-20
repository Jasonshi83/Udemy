/**
 * @program DaysInMonth
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 19:11
 */

public class DaysInMonth {

  private static String IsLeapYear(int year)
  {
    if(year>=1 && year<=9999)
    {
      if(year%400==0||(year%4==0 && year%100!=0))
      {
        return "true";
      }
      else
      {
        return "false";
      }

    }
    else
    {
      return "false";
    }
  }

  private static int getDaysInMonth(int month, int year)
  {
    if(month<1 || month>12 || year<1 || year>9999)
      return -1;
    else
    {
      switch(month)
      {
        case 1: case 3:case 5:case 7:case 8: case 10:case 12:
        return 31;
        case 4: case 6: case 9: case 11:
          return 30;
        case 2:
          if(IsLeapYear(year).equals("true"))
          {
            return 29;
          }
          else
          {
            return 28;
          }
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    IsLeapYear(1600);

    System.out.println(getDaysInMonth(1,2020));
    System.out.println(getDaysInMonth(2,2020));
    System.out.println(getDaysInMonth(2,2018));
    System.out.println(getDaysInMonth(-1,2020));
    System.out.println(getDaysInMonth(1,-2020));
  }
}
    