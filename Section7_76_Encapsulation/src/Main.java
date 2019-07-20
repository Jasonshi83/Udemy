/**
 * @program Section7_76_Encapsulation
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 22:22
 */

public class Main {
  public static void main(String[] args) {

    Printer printer = new Printer(100,0,true);

    printer.printPages();



    System.out.println(printer.getPagesPrinted());

    printer.fillToner();

    printer.fillToner();

    System.out.println(printer.getTonerLevel());

    printer.printPages();

    System.out.println(printer.getTonerLevel());



  }
}
    