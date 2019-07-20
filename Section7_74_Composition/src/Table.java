/**
 * @program Section7_74_Composition
 * @description:
 * @author: Zong Shi
 * @create 2019-07-03 16:13
 */

public class Table {

  private String tableName;
  private int tableNumber;
  private double tableLength;

  public Table(String tableName, int tableNumber, double tableLength) {
    this.tableName = tableName;
    this.tableNumber = tableNumber;
    this.tableLength = tableLength;
  }

  public String getTableName() {
    return tableName;
  }

  public int getTableNumber() {
    return tableNumber;
  }

  public double getTableLength() {
    return tableLength;
  }
}
    