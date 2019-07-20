import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program Section9_107_InterfaceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 09:34
 */

public class Main {

  public static void main(String[] args) {

  /*  Players tim = new Players("tim",100,50);
    System.out.println(tim);

    saveObject(tim);

    tim.setHitPoints(8);
    System.out.println(tim);

    tim.setWeapon("Storm");

    saveObject(tim);
    loadObject(tim);
    System.out.println(tim);
*/
    ISaveable jason = new Monsters("jason",1000,200);
    System.out.println(jason.toString());

    saveObject(jason);

    ((Monsters)jason).setHitPointsMonster(10001);
    System.out.println(jason);

    ArrayList<String> name  = loadObject(jason);

  }


  public static ArrayList<String> readValues()
  {
    ArrayList<String> values = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index = 0;
    System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");
    while(!quit)
    {
      System.out.println("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice)
      {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter a string");
          String stringInput = scanner.nextLine();
          values.add(index,stringInput);
          index ++;
          break;
      }
    }
    return values;
  }


  //括号中用ISaveable 是为了可以代入任何类型的继承了ISaveable这个接口的类。
   public static void saveObject(ISaveable objectToSave)
  {
    for (int i = 0; i < objectToSave.write().size(); i++) {
      System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

    }
  }

  public static void loadObject(ISaveable objectToLoad)
  {
    ArrayList<String> values = readValues();
    objectToLoad.read(values);
  }
}
    