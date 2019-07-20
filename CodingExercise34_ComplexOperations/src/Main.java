import javax.swing.plaf.ComboBoxUI;

/**
 * @program CodingExercise34_ComplexOperations
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 16:09
 */


// 注意在方法中可以将构造函数直接带参数放入，然后用对象.real 等方法读取里面的real值。

public class Main {

  public static void main(String[] args) {

    ComplexNumber comNumber = new ComplexNumber(100,200);
    System.out.println(comNumber.getReal());

    ComplexNumber comNumber1 = new ComplexNumber(200,400);
    comNumber1.add(1,1);
    System.out.println(comNumber1.getReal());
    System.out.println(comNumber1.getImaginary());
    comNumber1.subtract(2,2);
    System.out.println(comNumber1.getReal());
    System.out.println(comNumber1.getImaginary());

    comNumber1.subtract(new ComplexNumber(5,5));

    System.out.println(comNumber1.getReal());
    System.out.println(comNumber1.getImaginary());



  }
}
    