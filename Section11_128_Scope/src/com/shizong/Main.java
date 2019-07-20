package com.shizong;

import com.sun.source.tree.Scope;

public class Main {

    public static void main(String[] args) {

      String privateVar = "this is private to main()";

      System.out.println("hellow");

      ScopeCheck sc = new ScopeCheck();

      System.out.println("sc privateVar is " + sc.getPrivateVar());

      System.out.println(privateVar);

      System.out.println("privateVar : " + sc.getPrivateVar());
      sc.timesTwo();

      System.out.println("privateVar : " + sc.getPrivateVar());

      sc.print();

      System.out.println("**************");

      ScopeCheck.InnerClass in = sc.new InnerClass();

      in.timesTwo();


    }
}
