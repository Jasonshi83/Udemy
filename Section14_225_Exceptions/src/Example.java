import java.util.Scanner;

/**
 * @program Section14_225_Exceptions
 * @description:
 * @author: Zong Shi
 * @create 2019-08-04 17:30
 */

public class Example {
  public static void main(String[] args) {

    int result = divide();
    System.out.println(result);
  }

  private static int divide(){
    int x = getInt();
    int y = getInt();
    System.out.println("x is " + x + ", y is " + y);
    return x / y;
  }
  private static int getInt(){
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer ");
    return s.nextInt();
  }
}
    