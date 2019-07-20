/**
 * @program Section6_61_ConstructorChallengeExercise
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 13:49
 */

public class Account {

  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private int phoneNumber;

  public Account(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public Account() {
    this(222333444, 10000000, "PPP", "email@outlook.com", 887755);
  }

  public Account(int accountNumber, double balance) {
    this(accountNumber,balance, "jjjj","s@outlook.com",123);

    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public Account(int accountNumber, int phoneNumber) {
    this.accountNumber = accountNumber;
    this.phoneNumber = phoneNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void deposit(double fund) {
    if (fund >= 0) {
      this.balance += fund;
    }
  }

  public void withdraw(double fund) {
    if (fund >= 0 && fund <= balance) {
      this.balance -= fund;
      System.out.println("bank account balance is : " + balance + " after withdraw " + fund);
    } else {
      System.out.println("the balance of account is : " + balance + " and withdraw " + fund + " was denied");
    }

  }
}