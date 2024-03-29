import java.util.ArrayList;

/**
 * @program Section9_109_InnerClassDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 12:58
 */

public class Gearbox {
  private ArrayList<Gear> gears;
  private int maxGears;
  private int currentGear = 0;
  private boolean clutchIsIn;

  public Gearbox(int maxGears) {
    this.maxGears = maxGears;
    this.gears = new ArrayList<>();
    Gear neutral = new Gear(0,0.0);
    this.gears.add(neutral);
  }

  public void operateClutch(boolean in)
  {
    this.clutchIsIn=in;
  }


  public void addGearbox(int gearNumber, double ratio)
  {
    if(gearNumber>0 && gearNumber<=maxGears)
    {
      this.gears.add(new Gear(gearNumber, ratio));
    }
  }

  public void addGear(int number, double ratio)
  {
    if((number>0) && (number <= maxGears))
    {
      this.gears.add(new Gear(number,ratio));
    }
  }

  public void changeGear(int newGear)
  {
    if((newGear>=0) && (newGear<this.gears.size())&&this.clutchIsIn)
    {
      this.currentGear = newGear;
      System.out.println("Gear " + newGear + " selected");
    }
    else
    {
      System.out.println("Grind!");
      this.currentGear = 0;
    }
  }

  public double wheelSpeed(int revs)
  {
    if(clutchIsIn)
    {
      System.out.println("Scream!");
      return 0.0;
    }
    return revs*gears.get(currentGear).getRatio();
  }


  private class Gear
  {
    private int gearNumber;
    private double ratio;

    public Gear(int gearNumber, double ratio) {

      this.gearNumber = gearNumber;
      this.ratio = ratio;
    }

    public double driveSpeed(int revs)
    {
      return revs * (this.ratio);
    }

    public double getRatio() {
      return ratio;
    }
  }
}