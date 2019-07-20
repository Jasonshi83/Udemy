/**
 * @program Section6_70_InheritanceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 23:02
 */

public class Main {

  public static void main(String[] args)
  {
    Vehicle vehicle = new Vehicle("toyota",4,"yellow",100);

    vehicle.handSteering();
    vehicle.changingGears();

    vehicle.movingFaster(50);

    System.out.println(vehicle.getSpeed());


    Car car =new Car(10,"wagan");

    car.movingFaster(123);

    System.out.println("car speed is " + car.getSpeed());

    Another another = new Another(100,"SUV", 300,180,17000);

    another.movingSlower(45);

    System.out.println("another has speed " + another.getSpeed());

    System.out.println(another.getHeight());

    System.out.println(another.getWheelNumber());

    System.out.println(another.getVehicleName());
  }







}
    