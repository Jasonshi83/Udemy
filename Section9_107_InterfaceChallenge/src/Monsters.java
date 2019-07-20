import java.util.ArrayList;
import java.util.List;

/**
 * @program Section9_107_InterfaceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 09:30
 */

public class Monsters implements ISaveable {

  private String name;
  private int hitPointsMonster;
  private int strengthMonster;

  public Monsters(String name, int hitPointsMonster, int strengthMonster) {
    this.name = name;
    this.hitPointsMonster = hitPointsMonster;
    this.strengthMonster = strengthMonster;
  }

  @Override
  public String toString() {
    return "Monsters{" +
            "name='" + name + '\'' +
            ", hitPointsMonster=" + hitPointsMonster +
            ", strengthMonster=" + strengthMonster +
            '}';
  }

  @Override
  public List<String> write()
  {
    List<String> values = new ArrayList<>();
    values.add(0,this.name);
    values.add(1,""+ this.hitPointsMonster);
    values.add(2,""+this.strengthMonster);
    return values;
  }

  @Override
  public void read(List<String> savedValues) {
    if(savedValues!=null && savedValues.size()>0)
    {
      this.name = savedValues.get(0);
      this.hitPointsMonster = Integer.parseInt(savedValues.get(1));
      this.strengthMonster = Integer.parseInt(savedValues.get(2));
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHitPointsMonster() {
    return hitPointsMonster;
  }

  public void setHitPointsMonster(int hitPointsMonster) {
    this.hitPointsMonster = hitPointsMonster;
  }

  public int getStrengthMonster() {
    return strengthMonster;
  }

  public void setStrengthMonster(int strengthMonster) {
    this.strengthMonster = strengthMonster;
  }
}
    