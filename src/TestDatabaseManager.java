import java.io.File;
import java.util.ArrayList;

/**
 * @author Matthew Meyer
 */
public class TestDatabaseManager {
    public static void main(String[] args) {
DatabaseManager.Create();
Inventory IN = new Inventory("name", 1001, 10, 100, "cat", "sup");
Inventory IN2 = new Inventory("name", 101, 10, 100, "cat", "sup");
DatabaseManager.AddInventory(IN);
DatabaseManager.AddInventory(IN2);
      ArrayList<Inventory> i = DatabaseManager.AllInventory();
      for (Inventory iv : i )
      System.out.println(i.toString());
   }
}
