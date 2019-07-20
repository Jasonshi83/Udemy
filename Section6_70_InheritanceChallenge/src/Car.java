import java.sql.SQLOutput;

/**
 * @program Section6_70_InheritanceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 22:18
 */

public class Car extends Vehicle{
  private int seats;
  private String type;
  public Car(int seats,String type)
  {
    super("shizong",4,"yellow",200);
    this.seats = seats;
    this.type = type;
  }

  public int getSeats() {
    return seats;
  }

  public String getType() {
    return type;
  }
}
    