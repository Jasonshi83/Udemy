import java.util.Scanner;

/**
 * @program Section7_88_ArrayListDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 18:26
 */

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    GroceryList groceryList = new GroceryList();
    groceryList.printChoiceManual();

    while(true)
    {
      System.out.println("Enter your choice: ");
      int choice = scanner.nextInt();

//      if(choice!=Integer)

      switch(choice)
      {
        case 0:
          groceryList.printChoiceManual();
          break;
        case 1:
          groceryList.printListOfGroceryItems();
          break;
        case 2:
          groceryList.addItemToGroceryList();
          break;
        case 3:
          groceryList.modifyItemInTheList();
          break;
        case 4:
          groceryList.removeItemFromList();
          break;
        case 5:
          groceryList.searchItemInTheList();
          break;
        case 6:
          groceryList.quitApplication();
          break;

      }
    }



  }
}
    