/**
 * @program Section6_64_InheritanceDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 18:10
 */

public class Dog extends Animal {


  private int tail;
  private int legs;
  public void bark()
  {
    System.out.println("Dog bark called");
  }

  public int getTail() {
    return tail;
  }

  public int getLegs() {
    return legs;
  }

  public Dog(int tail, int legs, String name,int body, int eyes)
  {
    super(name,body,eyes);
  }

  public void eat()
  {
    super.eat();
  }

  public void sleep()
  {
    super.sleep();
  }

  public void dogEat()
  {
    System.out.println("dog eat called");
  }

  public void dogRun(int speed)
  {
    super.run(speed);
  }



}
    