import java.util.Scanner;

/**
 * @program Section5_53_ScannerDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-01 18:52
 */


// 在scanner.nextInt()之后 如果要使用scanner.nextLine()，必须在两者之间使用scanner.nextLine()，否则后者不会出现出入选项

public class ScannerDemo {

  private static void scannerInput()
  {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please input your age");

    int age = scanner.nextInt();

    System.out.println("your age is " + age);

//    scanner.nextLine();

//    System.out.println("Please input your name");
//    String keyboard = scanner.nextLine();

   System.out.println("Please input your age");

    String keyboard1 = scanner.nextLine();

    System.out.println(keyboard1);

   /*  int tempNum = Integer.parseInt(keyboard1);



    System.out.println(tempNum);

    System.out.println(tempNum==100);

    System.out.println("test1");

    int keyboard2 = scanner.nextInt();

    System.out.println(keyboard2);

    System.out.println("test2");*/

    int keyboard3 = scanner.nextInt();

    System.out.println(keyboard3);

    scanner.close();


  }



  public static void main(String[] args) {

    scannerInput();

  }
}
    