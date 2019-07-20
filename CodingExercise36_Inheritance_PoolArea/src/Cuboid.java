import java.awt.geom.Area;

/**
 * @program CodingExercise36_Inheritance_PoolArea
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 10:11
 */

public class Cuboid extends Rectangle {
  private double height;
  public Cuboid(double width, double length, double height)
  {
    super(width, length);
    if(height<0)
    {
      this.height = 0;
    }
    else
    {
      this.height = height;
    }
  }

  public double getHeight()
  {
    return height;
  }

  public double getVolume()
  {
    return getArea()*height;
  }
}
    