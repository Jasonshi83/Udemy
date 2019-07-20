/**
 * @program Section7_74_Composition
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 20:20
 */

public class Main {
  public static void main(String[] args) {

    Table table1 = new Table("Jtable",10,100);

    Table table2 = new Table("Jtable2",20,200);

    Chair chair1 = new Chair(4,"Jchair","yellow");

    Chair chair2 = new Chair(8,"Jchair2","blue");

    Bedroom bedroom1 = new Bedroom(10,20);

    Bedroom bedroom2 = new Bedroom(15,25);


    House house = new House("Jason",table1,table2,bedroom1,bedroom2,chair1,chair2);


    bedroom1.makingBed();

    System.out.println("windows number = " + house.getBedroom1().getWindowNumber());

  }
}
    