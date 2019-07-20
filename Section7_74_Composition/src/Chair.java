/**
 * @program Section7_74_Composition
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 16:15
 */

public class Chair {
  private int legNumber;
  private String chairName;
  private String color;

  public Chair(int legNumber, String chairName, String color) {
    this.legNumber = legNumber;
    this.chairName = chairName;
    this.color = color;
  }

  public int getLegNumber() {
    return legNumber;
  }

  public String getChairName() {
    return chairName;
  }

  public String getColor() {
    return color;
  }
}
    