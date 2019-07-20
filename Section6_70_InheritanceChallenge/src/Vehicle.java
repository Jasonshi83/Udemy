/**
 * @program Section6_70_InheritanceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 22:18
 */

public class Vehicle {
  private String vehicleName;
  private int wheelNumber;
  private String color;
  private double speed;

  public Vehicle(String vehicleName, int wheelNumber, String color, double speed)
  {
    this.vehicleName = vehicleName;
    this.wheelNumber = wheelNumber;
    this.color = color;
    this.speed = speed;
  }

  public void handSteering()
  {
    System.out.println("Vehicle handSteering called");
  }

  public void changingGears()
  {
    System.out.println("Vehicle changingGears called");
  }

  public void movingFaster(int speed)
  {
    this.speed += speed;
  }

  public void movingSlower(int speed)
  {
    this.speed -= speed;
  }

  public String getVehicleName() {
    return vehicleName;
  }

  public int getWheelNumber() {
    return wheelNumber;
  }

  public String getColor() {
    return color;
  }

  public double getSpeed() {
    return speed;
  }
}
    