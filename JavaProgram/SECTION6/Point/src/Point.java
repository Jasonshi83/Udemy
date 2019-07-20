/**
 * @program SECTION6
 * @description:
 * @author: Zong Shi
 * @create 2019-06-13 21:29
 */

public class Point {
  int x = 0;
  int y = 0;

  public Point() {
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  public double distance()
  {
    return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
  }

  public double distance(double x, double y)
  {
    return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
  }


}
    