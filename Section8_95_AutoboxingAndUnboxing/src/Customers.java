import javax.naming.InitialContext;
import java.util.ArrayList;

/**
 * @program Section8_95_AutoboxingAndUnboxing
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 21:39
 */

public class Customers {

  private String name;

  private ArrayList<Double> transactions;


  public Customers(String name, double initialAmount) {
    this.name = name;
    this.transactions = new ArrayList<>();
    addTransaction(initialAmount);
  }

  public void addTransaction(double amount)
  {
    this.transactions.add(amount);
  }


  public String getName() {
    return name;
  }

  public ArrayList<Double> getTransactions() {
    return transactions;
  }
}
    