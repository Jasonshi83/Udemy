/**
 * @program Inheritance
 * @description:
 * @author: Zong Shi
 * @create 2019-06-15 16:36
 */


public class TestDemo {

public static int Unknown(int num1, int num2) {
  int num3 = num1 + num2;
  num2 += num3 * 2;
  return(num2);
  }
  /*
  public static int Mystery(int num1, int num2) {
    num1 = Unknown(num1, num2);
    num2 = Unknown(num2, num1);

    System.out.println("num1*** = " +  num1);
    System.out.println("num2*** = " + num2);
    return(num2);
  }

  public static int Unknown(int x, int y)
  {
    System.out.println("num1 in unknown : " + x);
    System.out.println("num2 in unknown : " + y);
    return x+y;
  }
*/


  public static int Mystery(int num1, int num2)
  {
    num1 = Unknown(num1, num2);
    num2 = Unknown(num2, num1);
    return(num2);
  }


  public static void main(String[] args) {

    int num1 = 2;
    int num2 = 13;
    System.out.println("The 1st number is: " + Mystery(num1, 6));
    System.out.println("The 2nd number is: " + Mystery(num2 % 5, 1 + num1 * 2));
  }
}
    