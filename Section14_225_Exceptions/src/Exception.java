import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program Section14_225_Exceptions
 * @description:
 * @author: Zong Shi
 * @create 2019-08-04 16:10
 */

public class Exception {
  public static void main(String[] args) {
//    int x = 98;
//    int y = 0;
//    System.out.println(divideEAFP(x,y));
//    System.out.println(divideLBYL(x,y));
//    System.out.println(divide(x,y));

    int xx = getIntEAFP();
    System.out.println("x is " + xx);
  }

  private static int getInt(){
    Scanner s = new Scanner(System.in);
    return s.nextInt();
  }

  private static int getIntLBYL()
  {
    Scanner s = new Scanner(System.in);
    boolean isValid = true;
    System.out.println("Please enter an integer");
    String input = s.next();
    for(int i=0; i<input.length(); i++){
      if(!Character.isDigit(input.charAt(i)))
        isValid = false;
      break;
    }
    if(isValid)
    {
      return Integer.parseInt(input);
    }
    return 0;
  }

  private static int getIntEAFP()
  {
    Scanner s = new Scanner(System.in);
    try{
      return s.nextInt();
    }catch(InputMismatchException e)
    {
      return 0;
    }
  }


  private static int divideLBYL(int x, int y) {
    if (y != 0)
    {
      return x / y;
    }else{
      return 0;
    }
  }

  private static int divideEAFP(int x, int y)
  {
    try{
      return x/y;
    }catch (ArithmeticException e){
      return 0;
    }
  }
  private static int divide(int x, int y)
  {
    return x/y;
  }

}
    