/**
 * @program Section6_64_InheritanceDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 17:23
 */

public class Animal {
  private String name;
  private int body;
  private int eyes;

  public Animal(String name, int body, int eyes)
  {
    this.name = name;
    this.body = body;
    this.eyes = eyes;
  }

  public void eat()
  {
    System.out.println("Animal eat called");
  }

  public void sleep()
  {
    System.out.println("Animal sleep called");
  }

  public void run(double speed)
  {
    System.out.println("Animal run at speed " + speed);
  }

}
    