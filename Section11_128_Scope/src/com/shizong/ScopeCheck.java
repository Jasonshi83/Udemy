package com.shizong;

import java.sql.SQLOutput;

/**
 * @program Section11_128_Scope
 * @description:
 * @author: Zong Shi
 * @create 2019-07-16 22:59
 */

public class ScopeCheck {
  public int publicVar = 100;
  private int privateVar = 200;

  public ScopeCheck()
  {
    System.out.println("Scopecheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
  }

  public int getPrivateVar()
  {
    return privateVar;
  }


  public void timesTwo()
  {
    int privateVar = 2;
    for (int i = 2; i < 10; i++) {
      System.out.println(i*privateVar);
    }
  }

  public void print()
  {
    System.out.println("Hell" + privateVar);
  }

  public class InnerClass
  {
    public int privateVar = 3;

    public InnerClass()
    {
      System.out.println("Inner class created privateVar is " + privateVar);
    }

    public void timesTwo()
    {
//      int privateVar = 2;
//      ScopeCheck.this.timesTwo();
      for (int i = 0; i < 10; i++) {
        System.out.println(i+ " times two is " + i*ScopeCheck.this.privateVar);//用外部类 scopecheck.this.privateVar来调用外部类的filed

      }
    }


  }


}
    