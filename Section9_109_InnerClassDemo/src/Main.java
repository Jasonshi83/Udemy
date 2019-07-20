/**
 * @program Section9_109_InnerClassDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 12:58
 */

public class Main {
  public static void main(String[] args) {

    Gearbox mcLaren = new Gearbox(10);

    mcLaren.addGear(1,5.3);
    mcLaren.addGear(2,10.6);
    mcLaren.addGear(3,15.7);

    mcLaren.operateClutch(true);
    mcLaren.changeGear(1);
    mcLaren.operateClutch(false);
    System.out.println(mcLaren.wheelSpeed(1000));
    mcLaren.changeGear(2);
    System.out.println(3000);


  }
}
    