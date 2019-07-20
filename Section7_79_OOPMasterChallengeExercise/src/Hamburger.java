/**
 * @program Section7_79_OOPMasterChallengeExercise
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 09:53
 */

public class Hamburger {
  private String burgerName;
  private String breadRollType;
  private String meatType;
  private int lettuceNumber;
  private int tomatoNumber;
  private int carrotNumber;
  private int sourceNumber;
  private double basePrice;
  private double lettucePrice;
  private double tomatoPrice;
  private double carrotPrice;
  private double sourcePrice;

  public Hamburger(String breadRollType, String meatType) {
    this.breadRollType = breadRollType;
    this.meatType = meatType;
    this.basePrice = 10;
    this.lettucePrice = 2;
    this.tomatoPrice = 3;
    this.carrotPrice = 2.5;
    this.sourcePrice = 1;
  }

  public double getTotalPrice()
  {
    return basePrice + lettucePrice * lettuceNumber + tomatoPrice*tomatoNumber + carrotPrice * carrotNumber + sourcePrice*sourceNumber;
  }

  public int getLettuceNumber() {
    return lettuceNumber;
  }

  public int getTomatoNumber() {
    return tomatoNumber;
  }

  public int getCarrotNumber() {
    return carrotNumber;
  }

  public int getSourceNumber() {
    return sourceNumber;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public double getLettucePrice() {
    return lettucePrice;
  }

  public double getTomatoPrice() {
    return tomatoPrice;
  }

  public double getCarrotPrice() {
    return carrotPrice;
  }

  public double getSourcePrice() {
    return sourcePrice;
  }

  public String getBurgerName() {
    return burgerName;
  }

  public void setAdditionalNumber(int lettuceNumber,int tomatoNumber,int carrotNumber, int sourceNumber)
  {
    this.lettuceNumber = lettuceNumber;
    this.tomatoNumber = tomatoNumber;
    this.carrotNumber = carrotNumber;
    this.sourceNumber = sourceNumber;
  }

  public void setBurgerName(String burgerName) {
    this.burgerName = burgerName;
  }

}
    