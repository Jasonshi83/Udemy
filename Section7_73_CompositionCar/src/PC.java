/**
 * @program Section7_73_CompositionCar
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 18:32
 */

public class PC {
  private Case theCase;
  private Monitor monitor;
  private Motherboard motherboard;

  public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
    this.theCase = theCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  public void PowerOn()
  {
    monitor.getNativeResolution().getHeight();
    monitor.drawPixelAt(200,300,"yellow");
    motherboard.loadProgram("windows");
    theCase.pressPowerButton();
  }


}
    