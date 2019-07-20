/**
 * @program Section7_79_OOPMasterChallengeExercise
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 10:07
 */

public class HealthyBurger extends Hamburger {
  private int hamNumber;
  private double hamPrice;
  private int cheeseNumber;
  private double cheesePrice;

  public HealthyBurger(String breadRollType, String meatType, int hamNumber, int cheeseNumber) {
    super(breadRollType, meatType);
    this.hamNumber = hamNumber;
    this.hamPrice = 2.5;
    this.cheeseNumber = cheeseNumber;
    this.cheesePrice = 5;
  }

  @Override
  public void setAdditionalNumber(int lettuceNumber, int tomatoNumber, int carrotNumber, int sourceNumber) {
    super.setAdditionalNumber(lettuceNumber, tomatoNumber, carrotNumber, sourceNumber);
  }

  public double getTotalPrice() {
    return super.getTotalPrice()+hamNumber*hamPrice + cheeseNumber*cheesePrice;
  }

  public int getHamNumber() {
    return hamNumber;
  }

  public double getHamPrice() {
    return hamPrice;
  }

  public int getCheeseNumber() {
    return cheeseNumber;
  }

  public double getCheesePrice() {
    return cheesePrice;
  }
}
    