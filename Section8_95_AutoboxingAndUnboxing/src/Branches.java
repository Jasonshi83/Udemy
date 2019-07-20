import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @program Section8_95_AutoboxingAndUnboxing
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 21:39
 */

public class Branches {

  private String branchName;

  ArrayList<Customers> customers;

  public Branches(String branchName) {

    this.branchName = branchName;
    customers = new ArrayList<>();

  }

  public boolean newCustomer(String customerName, double initialAmount)
  {
    if(findCustomer(customerName) == null)
    {
      this.customers.add(new Customers(customerName, initialAmount));
      return true;
    }

    return false;
  }

  public boolean addCustomerTransaction(String customerName, double amount)
  {
    Customers existingCustomer = findCustomer(customerName);

    if(findCustomer(customerName)!=null)
    {
      existingCustomer.addTransaction(amount);
      return true;
    }
    return false;
  }

  private Customers findCustomer(String customerName)
  {
    for (int i = 0; i < this.customers.size(); i++) {
      Customers checkedCustomer = this.customers.get(i);
       if(this.customers.get(i).getName().equals(customerName))
       {
         return checkedCustomer;
       }
    }
    return null;
  }

  public void addNewCustomers(Customers newCustomer)
  {
    this.customers.add(newCustomer);

  }

  public String getBranchName() {
    return branchName;
  }

  public ArrayList<Customers> getCustomers() {
    return customers;
  }
}
    