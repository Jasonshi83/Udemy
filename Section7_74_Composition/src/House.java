/**
 * @program Section7_74_Composition
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 15:51
 */

public class House {

  private String name;
  private Table table1;
  private Table table2;
  private Bedroom bedroom1;
  private Bedroom bedroom2;
  private Chair chair1;
  private Chair chair2;

  public House(String name, Table table1, Table table2, Bedroom bedroom1, Bedroom bedroom2, Chair chair1, Chair chair2)
  {
    this.name = name;
    this.table1 = table1;
    this.table2 = table2;
    this.bedroom1 = bedroom1;
    this.bedroom2 = bedroom2;
    this.chair1 = chair1;
    this.chair2 = chair2;
  }


  public String getName() {
    return name;
  }

  public Table getTable1() {
    return table1;
  }

  public Table getTable2() {
    return table2;
  }

  public Bedroom getBedroom1() {
    return bedroom1;
  }

  public Bedroom getBedroom2() {
    return bedroom2;
  }

  public Chair getChair1() {
    return chair1;
  }

  public Chair getChair2() {
    return chair2;
  }
}
    