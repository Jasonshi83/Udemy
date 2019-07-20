/**
 * @program Section5_46
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 18:54
 */

public class Main {



  public static void printDayOfTheWeek(int day)
  {
    /*switch(day)
    {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid day");
    }*/

    if(day == 1)
    {
      System.out.println("Sunday");
    }
    else if(day == 1)
    {
      System.out.println("Monday");
    }
    else if(day == 6)
    {
      System.out.println("Saturday");
    }
    else
    {
      System.out.println("Invalid day");
    }

  }


  public static void main(String[] args) {

    printDayOfTheWeek(7);

  }
}
    