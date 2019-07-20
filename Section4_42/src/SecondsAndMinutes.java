import java.sql.SQLOutput;

/**
 * @program Section4_42
 * @description:
 * @author: Zong Shi
 * @create 2019-06-30 15:05
 */

public class SecondsAndMinutes {

  public static String getDurationString(int minutes, int seconds)
  {
    if(minutes < 0)
    {
      return "minutes " + minutes + " is invalid";
    }

    else if(seconds < 0 || seconds>=60)
    {
      return "seconds " + seconds + " is invalid";
    }

    else
    {
      int hours = minutes / 60;
      int mins = minutes % 60;
      return minutes + " minutes and " + seconds + " seconds equals to " + hours + " hours and " + mins + " minutes " + seconds + " seconds";
    }
  }



  public static String getDurationString(int seconds)
  {
    if(seconds < 0)
    {
      return "seconds " + seconds + " is invalid";
    }

    else
    {
      int mins = seconds / 60;
      int sec = seconds % 60;
      return getDurationString(mins,sec);
    }
  }

  public static void main(String[] args)
  {
    System.out.println(getDurationString(100,50));

    System.out.println(getDurationString(1000));
  }
}
    