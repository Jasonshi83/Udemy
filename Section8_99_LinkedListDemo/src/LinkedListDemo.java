import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @program Section8_99_LinkedListDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-05 18:08
 */

public class LinkedListDemo {

  public static void main(String[] args) {

    LinkedList<String> citiesToVisit = new LinkedList<>();

    /*addInOrder(citiesToVisit,"Beijing");
    addInOrder(citiesToVisit,"Ningbo");
    addInOrder(citiesToVisit,"Hangzhou");
    addInOrder(citiesToVisit,"Anshan");*/

    citiesToVisit.add("Beijing");
    citiesToVisit.add("N");
    citiesToVisit.add("C");
    citiesToVisit.add("BA");


    printList(citiesToVisit);

    visit(citiesToVisit);


  }
  private static void printList(LinkedList<String> linkedList)
  {
    Iterator<String> i = linkedList.iterator();
    while(i.hasNext())
    {
      System.out.println("Now doing" + i.next());
    }
    System.out.println("===============");
  }

  private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
  {
    ListIterator<String> it = linkedList.listIterator();

    while(it.hasNext())
    {
      int comparison = it.next().compareTo(newCity);
      if(comparison==0)
      {
        System.out.println("city is already included in the List");
        return false;
      }
      else if(comparison>0)
      {
        it.previous();
        it.add(newCity);
        return true;
      }
      else if(comparison<0)
      {
      }
    }
    it.add(newCity);
    return true;
  }

  private static void visit(LinkedList cities)
  {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;

    ListIterator<String> listIterator = cities.listIterator();

    if(cities.isEmpty())
    {
      System.out.println("No cities in the itinerary");
      return;
    }
    else
    {
      System.out.println("Now visiting " + listIterator.next());
    }

    while(!quit)
    {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch(action) {
        case 0:
          System.out.println("Holiday over");
          break;
        case 1:
          if (!goingForward){
            if(listIterator.hasNext())
            {
              listIterator.next();
            }
            goingForward = true;
          }
          if(listIterator.hasNext())
          {
            System.out.println("Now visiting " + listIterator.next());
          }
          else
          {
            System.out.println("Reach the end of the list");
            goingForward = false;
          }
          break;
        case 2:
          if(goingForward)
          {
            if(listIterator.hasPrevious())
            {
              listIterator.previous();
              System.out.println("test-----" + listIterator.next());
            }
            goingForward = false;
          }
          if(listIterator.hasPrevious())
          {
            System.out.println("Now visiting " + listIterator.previous());
          }
          else
          {
            System.out.println("We are at the start of the list");
            goingForward = true;
          }
          break;
        case 3:
          printMenu();
          break;
      }
    }
  }

  private static void printMenu()
  {
    System.out.println("Available atcion: \n press ");
    System.out.println("0 - to quit\n" + "1 - go to next city\n" + "2 - go to previous city\n" + "3 - print menu options");
  }

}
    