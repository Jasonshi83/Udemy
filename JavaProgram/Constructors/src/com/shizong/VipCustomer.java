package com.shizong;

/**
 * @program Constructors
 * @description:
 * @author: Zong Shi
 * @create 2019-06-12 22:55
 */

public class VipCustomer {

  private String name;

  private double creditLimit;

  private String email;


  public VipCustomer(String name, double creditLimit, String email) {
    System.out.println("123-----123");
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public VipCustomer(double creditLimit, String email) {
    this("jason",creditLimit,email);
  }

  public VipCustomer() {
    this("jason",100.0, "dfjadfa");
    System.out.println("bob has no money");
  }

  public VipCustomer(double creditLimit) {
    this("shi",creditLimit,"djfdja@djfald.com");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }






}
    