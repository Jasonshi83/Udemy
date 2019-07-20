/**
 * @program Section7_79_OOPMasterChallengeExercise
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 10:14
 */

public class DeluxeHamburger extends Hamburger{

  private double chipsPrice;
  private double drinksPrice;

  public DeluxeHamburger(String breadRollType, String meatType, double chipsPrice, double drinksPrice) {
    super(breadRollType, meatType);
    this.chipsPrice = chipsPrice;
    this.drinksPrice = drinksPrice;
  }

  public double getTotalPrice()
  {
    return super.getBasePrice() + chipsPrice + drinksPrice;
  }

  public double getChipsPrice() {
    return chipsPrice;
  }

  public double getDrinksPrice() {
    return drinksPrice;
  }




}
    