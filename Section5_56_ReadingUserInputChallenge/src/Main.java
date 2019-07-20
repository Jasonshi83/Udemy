import java.util.Scanner;

/**
 * @program Section5_56_ReadingUserInputChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 19:16
 */

public class Main {

  private static int readTenNumber()
  {
    Scanner scanner = new Scanner(System.in);
    int counter = 1;
    int sum = 0;
    while(counter <=10)
    {
      System.out.println("Enter number #" + counter);

      if(scanner.hasNextInt()) // hasNextInt()在这里的作用是判断输入的值是否是int类型，如果是true ，则进入if内语句，如果false，则跳过if内容，进入else内容
      {
        System.out.println("test------");
        int input = scanner.nextInt();
        sum = sum + input;
        counter++;
      }
      else
      {
        System.out.println("Invalid Number");
      }
      scanner.nextLine();
    }
    scanner.close();
    return sum;
  }

  public static void main(String[] args) {

    System.out.println("The sum is : " + readTenNumber());

  }
}
    