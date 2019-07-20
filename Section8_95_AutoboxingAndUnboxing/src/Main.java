/**
 * @program Section8_95_AutoboxingAndUnboxing
 * @description:
 * @author: Zong Shi
 * @create 2019-07-04 22:02
 */

public class Main {



  public static void main(String[] args) {

    Bank bank = new Bank("ANZ");

    bank.addNewBranch("Karori");

    bank.addCustomer("Karori","Jason",200);

    bank.addCustomer("Karori","Huoyanhua",300);

    bank.addCustomerTransaction("Karori","Jason",1234.5);



    bank.addNewBranch("Kelbern");

    bank.addCustomer("Kelbern","Jason",200);

    bank.addCustomer("Kelbern","Huoyanhua",100);

    bank.addCustomer("Kelbern","Willim",300);

    bank.addCustomerTransaction("Kelbern","Jason",1200);

    bank.addCustomer("Kelbern","ABC",1000);

    bank.listCustomers("Karori",true);
















  }
}
    