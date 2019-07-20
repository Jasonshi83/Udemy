/**
 * @program Section7_78_Polymorphism
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 23:31
 */

class Car
{
  private boolean engine ;
  private int cylindersNumber;
  private String cylindersName;
  private int wheelsNumber;

  public Car(int cylindersNumber, String cylindersName) {
    this.cylindersNumber = cylindersNumber;
    this.cylindersName = cylindersName;
    this.engine = true;
    this.wheelsNumber =4 ;
  }

  public boolean isEngine() {
    return engine;
  }

  public int getCylindersNumber() {
    return cylindersNumber;
  }

  public String getCylindersName() {
    return cylindersName;
  }

  public int getWheelsNumber() {
    return wheelsNumber;
  }

  public void startEngine()
  {
    System.out.println("Car engine start");
  }

  public void accelerate()
  {
    System.out.println("Car accelerate");
  }

  public void carBreak()
  {
    System.out.println("Car break");
  }


}

class BMW extends Car
{
  private int wheels;
  private String carName = "BMW";

  public BMW(int cylindersNumber, String cylindersName, int wheels, String carName) {
    super(cylindersNumber, cylindersName);
    this.wheels = wheels;
    this.carName = carName;
  }

  @Override
  public boolean isEngine() {
    return false;
  }

  @Override
  public void accelerate() {
    System.out.println("BMW accelerate");
  }

  @Override
  public void carBreak() {
    System.out.println("BMW break");
  }

  @Override
  public void startEngine() {
    System.out.println("BMW engine start");
  }
}


class Benz extends Car
{

  private String BenzModel;

  private int BenzSeats;

  public Benz(int cylindersNumber, String cylindersName, String benzModel, int benzSeats) {
    super(cylindersNumber, cylindersName);
    BenzModel = benzModel;
    BenzSeats = benzSeats;
  }

  @Override
  public boolean isEngine() {
    return true;
  }

  @Override
  public void startEngine() {
    System.out.println("Main.Benz start Engine");
  }

  @Override
  public void accelerate() {
    System.out.println("Main.Benz accelerate");
  }

  @Override
  public void carBreak() {
    System.out.println("Main.Benz carBreak");
  }
}




public class Main {
  public static void main(String[] args) {

    Car car = new Benz(4,"benz","sedan",4);
    car.accelerate();

    Car car1 = new BMW(4,"BWM Cylinder",4,"BWM wagon");
    car1.startEngine();

  }

  static class Ford extends Car
  {

    private String BenzModel;

    private int BenzSeats;

    public Ford(int cylindersNumber, String cylindersName, String benzModel, int benzSeats) {
      super(cylindersNumber, cylindersName);
      BenzModel = benzModel;
      BenzSeats = benzSeats;
    }

    @Override
    public boolean isEngine() {
      return true;
    }

    @Override
    public void startEngine() {
      System.out.println("Main.Ford start Engine");
    }

    @Override
    public void accelerate() {
      System.out.println("Main.Ford accelerate");
    }

    @Override
    public void carBreak() {
      System.out.println("Main.Ford carBreak");
    }
  }
}
    