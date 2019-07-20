/**
 * @program Section4
 * @description:
 * @author: Zong Shi
 * @create 2019-06-29 16:06
 */

public class CalculationDemo {

  public static void displayHighScorePosition(String playerName, String position)
  {
    System.out.println(playerName + " managed to get into position " + position + " on the high score table");

  }

  public static int calculateHighScorePosition(int score)
  {

    if(score>1000)
    {
      return 1;
    }
    else if(score>500 && score<1000)
    {
      return 2;
    }
    else if(score > 100 && score < 500)
    {
      return 3;
    }
    else
    {
      return 4;
    }
  }


  public static void main(String[] args) {


    displayHighScorePosition("Jason","Front");
    int num = calculateHighScorePosition(1500);
    int num1 = calculateHighScorePosition(900);
    int num2 = calculateHighScorePosition(400);
    int num3 = calculateHighScorePosition(50);

    System.out.println(num + " " + num1 + " " + num2 + " " + num3 + " ");
  }

}
    