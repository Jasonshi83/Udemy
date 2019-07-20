import java.util.HashMap;
import java.util.Map;

/**
 * @program Section12_142_AdvantureGame
 * @description:
 * @author: Zong Shi
 * @create 2019-07-19 14:56
 */

public class Location {
  private final int locationID;
  private final String description;
  private final Map<String, Integer> exits;

  public Location(int locationID, String description) {
    this.locationID = locationID;
    this.description = description;
    this.exits = new HashMap<>();
    this.exits.put("Q",0);
  }

  public void addExit(String direction, int location)
  {
    exits.put(direction, location);
  }

  public int getLocationID()
  {
    return locationID;
  }

  public String getDescription() {
    return description;
  }

  public Map<String, Integer> getExits() {
    return new HashMap<String, Integer>(exits);
  }


}
    