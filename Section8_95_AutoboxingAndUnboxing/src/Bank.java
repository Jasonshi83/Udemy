import java.util.ArrayList;

/**
 * @program Section8_95_AutoboxingAndUnboxing
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 21:39
 */

public class Bank {

  private String bankName;

  ArrayList<Branches> branches;


  public Bank(String bankName) {
    this.bankName = bankName;
    this.branches = new ArrayList<>();
  }

  public boolean addNewBranch(String branchName)
  {
    if(findBranch(branchName)==null)
    {
      this.branches.add(new Branches(branchName));
      return true;
    }
      return false;
  }

  public boolean addCustomer(String branchName, String customerName, double addAmount)
  {
    Branches branches = findBranch(branchName);
    if(branches!=null)
    {
      return branches.newCustomer(customerName, addAmount);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double amount)
  {
    Branches branches = findBranch(branchName);
    if(branches!=null)
    {
      return branches.addCustomerTransaction(customerName, amount);
    }
    return false;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public ArrayList<Branches> getBranches() {
    return branches;
  }

  public boolean listCustomers(String branchName,boolean showTransactions)
  {
    Branches branches = findBranch(branchName);
    if(branches != null)
    {
      System.out.println("Customer details for branch " + branches.getBranchName());
      ArrayList<Customers> branchCustomers = branches.getCustomers();
      for (int i = 0; i < branchCustomers.size(); i++) {
        Customers branchCustomer = branchCustomers.get(i);
        System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
        if(showTransactions)
        {
          System.out.println("Transactions");
          ArrayList<Double> transactions = branchCustomer.getTransactions();
          for (int j = 0; j < transactions.size(); j++) {
            System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
          }
        }
      }
      return true;
    }
    else
    {
      return false;
    }
  }

  private Branches findBranch(String branchName)
  {
    for (int i = 0; i < this.branches.size(); i++) {
      Branches checkBranch = this.branches.get(i);
      if(checkBranch.getBranchName().equalsIgnoreCase(branchName))
      {
        return checkBranch;
      }
    }
    return null;
  }
}































    