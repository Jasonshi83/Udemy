/**
 * @program Section6_64_InheritanceDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 18:13
 */

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog(2,4,"hello",1,2);
    Fish fish = new Fish(2,100,2);
    fish.eat();
    System.out.println("fish weight" + fish.getWeight());
    dog.eat();
    dog.sleep();
    dog.dogEat();
    dog.dogRun(200);
    System.out.println(dog.getLegs());

  }
}
    