import java.util.Scanner;

/**
 * @program CodingExercise27_InputCalculator
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 23:17
 */

//根据输入的数自动累加求和，然后输入字符后自动中断输入，并计算平均数

public class Main {

  public static void inputThenPrintSumAndAverage()
  {
    int sum = 0;
    int count = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input a Integer : ");
    //while这段重点记住
      while(true)
      {
        boolean hasNextInt = keyboard.hasNextInt();
        if(hasNextInt)
        {
        int input = keyboard.nextInt();
        sum = sum + input;
        count ++;
        }
        else
          break;//break会跳出while循环
      }
    long avg = Math.round((double)sum / (double)count);

    System.out.println("SUM = " + sum + " AVG = " + avg);

    keyboard.close();
    }



  public static void main(String[] args) {
    inputThenPrintSumAndAverage();

  }
}
    