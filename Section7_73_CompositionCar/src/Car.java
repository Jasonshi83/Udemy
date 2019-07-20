/**
 * @program Section7_73_CompositionCar
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 18:13
 */

public class Car extends Vehicle {
  private int doors;
  private int engineCapacity;


  public Car(String name, int doors, int engineCapacity) {
    super(name);
    this.doors = doors;
    this.engineCapacity = engineCapacity;
  }
}
    