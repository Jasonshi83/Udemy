/**
 * @program Inheritance
 * @description:
 * @author: Zong Shi
 * @create 2019-06-14 13:14
 */

public class Vehicle {

  private String color;
  private String model;
  private int wheelNum;
  private double speed;

  public void moving()
  {
    System.out.println("Car Moving");
  }

  public void Steering()
  {
    System.out.println("Car Steering");
  }

  public void ChangeGear()
  {
    System.out.println("Changing gears");
  }


  public Vehicle(String color, String model, int wheelNum, double speed) {
    this.color = color;
    this.model = model;
    this.wheelNum = wheelNum;
    this.speed = speed;
  }

  public static void main(String[] args) {

  }
}
    