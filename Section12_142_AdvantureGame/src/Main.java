import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program Section12_142_AdvantureGame
 * @description:
 * @author: Zong Shi
 * @create 2019-07-19 15:18
 */
//程序结构：
  /*
  * 首先建立一个Location的 MAP， 包含Integer，Location（Object），其中Location Object包含location ID 和 description，通过get命令可以获取。
  * 然后再在每一个location object中建立一个Exit的Map，一个location的Map可以包含不同数量的元素。
  * 再建立一个Map包含关键词与ExistMap中key的对应关系。
  * */

// Change the program to allow players to type full words, or phrases, then move to the
// correct location based upon their input.
// The player should be able to type commands such as "Go West", "run South", or just "East"
// and the program will move to the appropriate location if there is one.  As at present, an
// attempt to move in an invalid direction should print a message and remain in the same place.
//
// Single letter commands (N, W, S, E, Q) should still be available.

public class Main {

  private static Map<Integer, Location> locations = new HashMap<>();

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    locations.put(0,new Location(0,"You are sitting in front of a computer learning Java"));
    locations.put(1,new Location(1,"You are standing at the end of a road before a small brick building"));
    locations.put(2,new Location(2,"You are at the top of hill"));
    locations.put(3,new Location(3,"You are inside of a building, a well house for a small spring"));
    locations.put(4,new Location(4,"you are in a valley beside a stream"));
    locations.put(5,new Location(5,"you are in the forest"));

    locations.get(1).addExit("W",2);
    locations.get(1).addExit("E",3);
    locations.get(1).addExit("S",4);
    locations.get(1).addExit("N",5);
//    locations.get(1).addExit("Q",0);   //已经在Location的构造函数里添加了

    locations.get(2).addExit("N",5);
//    locations.get(1).addExit("Q",0);   //已经在Location的构造函数里添加了

    locations.get(3).addExit("W",1);
//    locations.get(1).addExit("Q",0);   //已经在Location的构造函数里添加了

    locations.get(4).addExit("N",1);
    locations.get(4).addExit("W",2);
    //    locations.get(1).addExit("Q",0);   //已经在Location的构造函数里添加了

    locations.get(5).addExit("S", 1);
    locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

    //新建一个Map去储存方向关键词和exits中方向的对照表
    Map<String, String> dMap = new HashMap<>();
    dMap.put("NORTH","N");
    dMap.put("SOUTH","S");
    dMap.put("EAST","E");
    dMap.put("WEST","W");

    System.out.println(locations.get(1).getDescription());




//    int loc = 1;
//    while(true)
//    {
//      System.out.println(locations.get(loc).getDescription());
//      if(loc == 0)
//      {
//        break;
//      }
//
//      Map<String, Integer> exits = locations.get(loc).getExits();
//      System.out.println("Available exits are ");
//
//      for(String exit : exits.keySet())
//      {
//        System.out.print(exit + ",");
//      }
//
//      System.out.println();
//
//
//      //输入句子
//      String direction = scanner.nextLine().toUpperCase();
//
//      if(direction.length()>1)
//      {
//        String [] command = direction.split(" ");
//
//        for(String s : command)
//        {
//          if(dMap.containsKey(s))
//          {
//            direction = dMap.get(s);
//            break;
//          }
//        }
//
//      }
//
//      if(exits.containsKey(direction))
//      {
//        loc = exits.get(direction);
//      }
//      else
//      {
//        System.out.println("You can't go in that direction");
//      }
//    }


  }
}
    