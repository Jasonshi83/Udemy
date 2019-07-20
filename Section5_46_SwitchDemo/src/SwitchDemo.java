/**
 * @program Section5_46_SwitchDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 18:04
 */

public class SwitchDemo {

  /*private static void switchCheck(char ch)
  {
    switch(ch)
    {
      case 'A':
      {
        System.out.println("A");
        break;
      }
      case 'B':
        System.out.println('B');
        break;
      case 'C':
        System.out.println('C');
        break;
      case 'D':
        System.out.println('D');
        break;
      case 'E':
        System.out.println('E');
        break;

      default:
          System.out.println("nothing found");
          break;
    }
  }*/

  private static void switchCheck(String stringValue)
  {
    switch(stringValue)
    {
      case "January":
        System.out.println(stringValue + " found");
        break;
      case "Febrary":
        System.out.println(stringValue + " found");
        break;
      case "March":
        System.out.println(stringValue + " found");
        break;
      case "April":
        System.out.println(stringValue + " found");
        break;

        default:
          System.out.println(stringValue + " can't be found");
    }
  }

  public static void main(String[] args) {

   switchCheck("January");
   switchCheck("March");
   switchCheck("November");


  }
}
    