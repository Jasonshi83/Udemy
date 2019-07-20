/**
 * @program Section6_62_ConstructorChallengeExercise
 * @description:
 * @author: Zong Shi
 * @create 2019-07-02 15:36
 */
//注意overload 不同构造函数的时候，需要创建一个包含所有元素的构造函数，然后其他构造函数来调用此构造函数。
public class VipCustomer {

  private String name;
  private double limit;
  private String email;

  public VipCustomer()
  {
    this("test1",123,"test2");
  }


  public VipCustomer(String name, double limit, String email)
  {
    this.name = name;
    this.limit = limit;
    this.email = email;

  }

  public VipCustomer(String name, double limit)
  {
    this(name, limit, "shizong");
  }

  public String getName() {
    return name;
  }

  public double getLimit() {
    return limit;
  }

  public String getEmail() {
    return email;
  }

}
    