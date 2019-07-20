import java.lang.annotation.Native;

/**
 * @program Section7_73_CompositionCar
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 18:12
 */

public class Main {

  public static void main(String[] args) {

    Dimensions dimensions = new Dimensions(200,200,5);

    Case theCase = new Case("100B","Dell","240",dimensions);

    Resolution resolution = new Resolution(10,20);

    Monitor theMonitor = new Monitor("27inch Beast","Acer", 27, resolution);

    Motherboard theMotherboard = new Motherboard("BJ-200","Arus",4,6,"v2.44");

    PC thePC = new PC(theCase,theMonitor,theMotherboard);

    thePC.PowerOn();

  }
}
    