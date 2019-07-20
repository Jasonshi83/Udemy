/**
 * @program CodingExercise35_Inheritance_Cylinder
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 09:50
 */

public class Cylinder extends Circle {
  private double height;
  public Cylinder(double radius, double height)
  {
    super(radius);
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
    return height * super.getArea();
  }
}
    