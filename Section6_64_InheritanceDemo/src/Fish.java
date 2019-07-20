/**
 * @program Section6_64_InheritanceDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 19:11
 */

public class Fish extends Animal {
  public int getGills() {
    return gills;
  }

  public int getWeight() {
    return weight;
  }

  public int getFins() {
    return fins;
  }

  private int gills;
  private int weight;
  private int fins;

  public Fish(int gills,int weight,int fins)
  {
    super("name", 1,2);
    this.gills = gills;
    this.weight = weight;
    this.fins = fins;
  }

  @Override
  public void eat() {
    System.out.println("fish eat called");
  }

  private void swim()
  {
    System.out.println("Fish swim is called");
  }

}
