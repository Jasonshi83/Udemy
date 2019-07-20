/**
 * @program Section5_48_ForLoopDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 20:21
 */

public class ForLoopDemo {

  public static void main(String[] args) {

    int Sum = 0;
    int counter = 0;
    for (int i = 1; i < 1001; i++) {
      if(i%3==0 && i%5==0)
      {
        System.out.println(i);
        Sum += i;
        counter ++;
      }
      if(counter == 5)
      {
        break;
      }
    }
    System.out.println(Sum);


  }
}
    