import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program Section7_88_ArrayListDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 18:26
 */

public class GroceryList {

  private static Scanner scanner = new Scanner(System.in);

  private static ArrayList<String> groceryList =new ArrayList<>();

  public void printChoiceManual()
  {
    System.out.println("Press");
    System.out.println("     0 - To print choice options.");
    System.out.println("     1 - To print the list of grocery items.");
    System.out.println("     2 - To add an item to the list.");
    System.out.println("     3 - To modify an item in the list.");
    System.out.println("     4 - To remove an item from the list.");
    System.out.println("     5 - To search an item from the list.");
    System.out.println("     6 - To quit the application.");
  }

  public void printListOfGroceryItems()
  {
    System.out.println("You have " + groceryList.size() + " in your grocery list.");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println(i + ". " + groceryList.get(i));
    }
  }

  public void addItemToGroceryList()
  {
    System.out.print("Please enter the grocery item: ");
    String addItem = scanner.nextLine();

    groceryList.add(addItem);
  }

  public void modifyItemInTheList()
  {
    System.out.println("Please input the item number.");
    int modifyItemNumber = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Please input the new item name.");
    String newItemName = scanner.nextLine();
    groceryList.set(modifyItemNumber,newItemName);
  }

  public void removeItemFromList()
  {
    System.out.println("Please enter item number that you want to remove from list.");
    int removeItemNumber = scanner.nextInt();
    scanner.nextLine();
    groceryList.remove(removeItemNumber);
  }

  public void searchItemInTheList()
  {
    System.out.println("Please input item number to check its existing.");
    String searchItem = scanner.nextLine();
    boolean flag = groceryList.contains(searchItem);
    if(flag == true)
    {
      System.out.println(searchItem + " is in the list.");
    }
    else
    {
      System.out.println(searchItem + " is not in the list.");
    }

  }

  public void quitApplication()
  {
    System.out.println("application is quit.");
    System.exit(1);
  }





}
    