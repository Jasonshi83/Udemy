package com.shizong;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @program Section11_130_ScopeChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-16 23:58
 */

public class X {

//  private int scanner;

  int x = 0;

  public int x()
  {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    System.out.println(this.x);
    return x;


  }
  public class XX
  {

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();


    public void print()
    {
      System.out.println("-------");
      System.out.println(X.this.x);
    }

  }
}
    