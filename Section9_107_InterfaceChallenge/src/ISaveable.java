import java.util.ArrayList;
import java.util.List;

/**
 * @program Section9_107_InterfaceChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 09:24
 */

public interface ISaveable {

   List<String> write();
   void read(List<String> savedValues);

}


    