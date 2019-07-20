/**
 * @program Section6_70_InheritanceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 22:19
 */

public class Another extends Car {
  private double volumn;
  private double height;
  private double price;

  public Another(int seats, String type, double volumn, double height, double price)
  {
    super(seats,type);
    this.volumn = volumn;
    this.height = height;
    this.price = price;
  }

  public double getVolumn() {
    return volumn;
  }

  public double getHeight() {
    return height;
  }

  public double getPrice() {
    return price;
  }
}
    