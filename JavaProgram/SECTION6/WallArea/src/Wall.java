/**
 * @program SECTION6
 * @description:
 * @author: Zong Shi
 * @create 2019-06-13 21:16
 */

public class Wall {

  private double width;
  private double height;

  public Wall() {


  }

  public Wall(double width, double height) {

    if (width < 0)
    {
      width = 0;
    }

    if(height<0)
    {
      height = 0;
    }

    this.width = width;
    this.height = height;
  }

  public double getWidth()
  {
    return width;
  }

  public double getHeight()
  {
    return height;
  }

  public void setWidth(double width)
  {
    if(width<0)
    {
      width = 0;
    }
    else
    {
      this.width = width;
    }
  }

  public void setHeight(double height)
  {
    if(height<0)
    {
      height=0;
    }
    else
    {
      this.height = height;
    }
  }

  public double getArea()
  {
    return width * height;
  }

  public static void main(String[] args) {

    Wall w = new Wall(100.0,20.0);
    double c = w.getArea();
    System.out.println(c);

  }
}
    