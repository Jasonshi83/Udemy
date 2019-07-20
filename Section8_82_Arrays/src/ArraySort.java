import java.util.Arrays;
import java.util.Scanner;

/**
 * @program Section8_82_Arrays
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 13:55
 */

public class ArraySort {


  int[] arr;

  private static Scanner scanner = new Scanner(System.in);

  public ArraySort(int number)
  {
    arr = new int[number];
  }

//  int[] newArray = Arrays.copyOf(arr,arr.length); //新建array的快捷方式

  public void inputArray()
  {
    System.out.println("please input element for array ");
    for (int i = 0; i < arr.length; i++) {

      arr[i] = scanner.nextInt();
    }
  }

  public void sortDecline()
  {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if(arr[j]>arr[i])
        {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public void listArray()
  {
    System.out.println("List of array after sorting is :");
    /*for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }*/

    //Arrays.toString()方法可打印array
    System.out.println(Arrays.toString(arr));
  }






}
    