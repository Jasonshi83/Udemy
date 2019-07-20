/**
 * @program Section6_61_ConstructorChallengeExercise
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 14:08
 */

public class Main {
  public static void main(String[] args) {

//    Account jasonsAccount = new Account(12345,5555.123,"Jason","Jason@outlook.com",12345678);
//    jasonsAccount.setAccountNumber(12345);
//    jasonsAccount.setBalance(5555.123);
//    jasonsAccount.setCustomerName("Jason");
//    jasonsAccount.setEmail("Jason@outlook.com");
//    jasonsAccount.setPhoneNumber(12345678);
//    Account jasonsAccount  = new Account();
    Account jasonsAccount = new Account(100,200.0);


    /*Account jAccount = new Account(123,100,"name","email",1);
    jasonsAccount.deposit(200.0);
    double currentBalance = jasonsAccount.getBalance();
    System.out.println(currentBalance);
    String name = jasonsAccount.getCustomerName();
    System.out.println(name);
    jasonsAccount.withdraw(6000);*/

    System.out.println(jasonsAccount.getBalance());
    System.out.println(jasonsAccount.getCustomerName());





  }
}
    