/**
 * @program Inheritance
 * @description:
 * @author: Zong Shi
 * @create 2019-06-14 13:14
 */

public class Car extends Vehicle{

  private String color;
  private String model;
  private int wheelNum;
  private double speed;
  private int seats;
  private String owner;

  private int currentGear;

  public Car(String color, String model, int wheelNum, double speed,int seats, String owner)
  {
    super("red","sedan",3,100);
    this.seats = seats;
    this.owner = owner;
    this.currentGear =1;
  }
}
    