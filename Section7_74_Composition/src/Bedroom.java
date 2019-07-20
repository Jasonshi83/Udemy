/**
 * @program Section7_74_Composition
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 15:50
 */

public class Bedroom {

  private int bedNumber;
  private int windowNumber;

  public Bedroom(int bedNumber, int windowNumber)
  {
    this.bedNumber = bedNumber;
    this.windowNumber = windowNumber;
  }

  public int getBedNumber()
  {
    return bedNumber;
  }

  public int getWindowNumber()
  {
    return windowNumber;
  }

  public void makingBed()
  {
    System.out.println("MakingBed is called");

  }




}
    