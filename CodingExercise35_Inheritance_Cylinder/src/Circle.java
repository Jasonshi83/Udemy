/**
 * @program CodingExercise35_Inheritance_Cylinder
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 09:47
 */

public class Circle {
  private double radius;
  public Circle(double radius)
  {
    if(radius<0)
    {
      this.radius = 0;
    }
    else
    {
      this.radius = radius;
    }
  }

  public double getRadius()
  {
    return radius;
  }

  public double getArea()
  {
    return radius*radius*Math.PI;
  }


}
    