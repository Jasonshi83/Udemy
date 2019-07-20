/**
 * @program CodingExercise29_SumCalculator
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 10:00
 */

public class Main {

  private double firstNumber = 0;
  private double secondNumber = 0;

  public double getFirstNumber()
  {
    return firstNumber;
  }

  public double getSecondNumber()
  {
    return secondNumber;
  }

  public void setFirstNumber(double firstNumber)
  {
    this.firstNumber = firstNumber;
  }

  public void setSecondNumber(double secondNumber)
  {
    this.secondNumber = secondNumber;
  }

  public double getAdditionResult()
  {
    return firstNumber + secondNumber;
  }

  public double getSubtractionResult()
  {
    return firstNumber - secondNumber;
  }

  public double getMultiplicationResult()
  {
    return firstNumber * secondNumber;
  }

  public double getDivisionResult()
  {
    if(secondNumber==0)
    {
      return 0;
    }
    else
    {
      return firstNumber / secondNumber;
    }
  }

  public static void main(String[] args) {

    Main simpleCalculator = new Main();
    simpleCalculator.setFirstNumber(5.0);
    simpleCalculator.setSecondNumber(4.0);
    System.out.println(simpleCalculator.getAdditionResult());
    System.out.println(simpleCalculator.getSubtractionResult());

    simpleCalculator.setFirstNumber(5.25);
    simpleCalculator.setSecondNumber(0);
    System.out.println(simpleCalculator.getMultiplicationResult());
    System.out.println(simpleCalculator.getDivisionResult());

  }
}
    