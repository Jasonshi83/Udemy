/**
 * @program Section7_76_Encapsulation
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 22:03
 */

public class Printer {
  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplexPrinter;

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public boolean isDuplexPrinter() {
    return duplexPrinter;
  }

  public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {

    if(tonerLevel>100||tonerLevel<0)
    {
      System.out.println("it is not correct tonerLevel");
    }
    else
    {
      this.tonerLevel = tonerLevel;
    }
    this.pagesPrinted = pagesPrinted;
    this.duplexPrinter = duplexPrinter;
  }

  public void fillToner()
  {
    if(tonerLevel<100)
    {
      tonerLevel = 100;
    }
    else
    {
      System.out.println("tonerLevel is full");
    }
  }

  public int printPages()
  {
    if(duplexPrinter==true)
    {
      tonerLevel = tonerLevel-2;
      return pagesPrinted = pagesPrinted+2;
    }
    else
    {
      tonerLevel = tonerLevel -1;
      return pagesPrinted++;
    }
  }
}
    