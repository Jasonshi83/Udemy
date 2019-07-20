import java.util.ArrayList;
import java.util.List;

/**
 * @program InterFaceDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-07 15:00
 */

public class Monster implements ISaveable{
  private String monsterName;
  private int monsterHP;
  private int monsterStrength;
  private String monsterWeapon;

  public Monster(String monsterName, int monsterHP, int monsterStrength, String monsterWeapon) {
    this.monsterName = monsterName;
    this.monsterHP = monsterHP;
    this.monsterStrength = monsterStrength;
    this.monsterWeapon = monsterWeapon;
  }

  @Override
  public String toString() {
    return "Monster{" +
            "monsterName='" + monsterName + '\'' +
            ", monsterHP=" + monsterHP +
            ", monsterStrength=" + monsterStrength +
            ", monsterWeapon='" + monsterWeapon + '\'' +
            '}';
  }

  @Override
  public List<String> write() {
    ArrayList<String> values = new ArrayList<>();
    values.add(0,this.monsterName);
    values.add(1,""+ this.monsterHP);
    values.add(2,""+ this.monsterStrength);
    values.add(3,"" + this.monsterWeapon);
    return values;
  }

  @Override
  public void read(List<String> savedValues) {
    this.monsterName = savedValues.get(0);
    this.monsterHP = Integer.parseInt(savedValues.get(1));
    this.monsterStrength = Integer.parseInt(savedValues.get(2));
    this.monsterWeapon = savedValues.get(3);
  }

  public String getMonsterName() {
    return monsterName;
  }

  public int getMonsterHP() {
    return monsterHP;
  }

  public int getMonsterStrength() {
    return monsterStrength;
  }

  public String getMonsterWeapon() {
    return monsterWeapon;
  }
}
    