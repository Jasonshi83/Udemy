import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @program Section8_99_LinkedListDemo
 * @description:
 * @author: Zong Shi
 * @create 2019-07-05 21:26
 */

public class Demo {
  public static void main(String[] args) {

    LinkedList<String> intDemo = new LinkedList<>();

    intDemo.add("1");
    intDemo.add("2");
    intDemo.add("3");
    intDemo.add("4");

    ListIterator<String> i = intDemo.listIterator();

    System.out.println(i.next());
    System.out.println(i.next());

    System.out.println(i.previous());
    System.out.println(i.next());





  }
}
    