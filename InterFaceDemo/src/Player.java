import java.util.ArrayList;
import java.util.List;

/**
 * @program InterFaceDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-07 14:44
 */

public class Player implements ISaveable{

  private String name;
  private int HP;
  private double strength;

  public Player(String name, int HP, double strength) {
    this.name = name;
    this.HP = HP;
    this.strength = strength;
  }

  public Player() {
  }

  @Override
  public String toString() {
    return "Player{" +
            "name='" + name + '\'' +
            ", HP=" + HP +
            ", strength=" + strength +
            '}';
  }

  @Override
  public List<String> write() {

    ArrayList<String> values = new ArrayList<>();

    values.add(0,this.name);
    values.add(1,"" + this.HP);
    values.add(2,"" + this.strength);
    return values;
  }

  @Override
  public void read(List<String> valueList) {
    this.name = valueList.get(0);
    this.HP = Integer.parseInt(valueList.get(1));
    this.strength = Integer.parseInt(valueList.get(2));
  }

  public String getName() {
    return name;
  }

  public int getHP() {
    return HP;
  }

  public double getStrength() {
    return strength;
  }
}
    