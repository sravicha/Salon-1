/** a
* @author Graison Day
*/
// A class meant for items that are supposed to go into inventories

public class InventoryItem {
    
    private String name;
    private int id;
    private int stock;
    
    InventoryItem() {}
    InventoryItem(String aName, int anId, int aStock){
      name = aName;
      id = anId;
      stock = aStock;
    }
      
    public String getName() {
      return name;
    }
    
    public int getId() {
      return id;
    }
      
    public int getStock() {
      return stock;
    }
    //make sets voids
    public String setName(String newName) {
      name = newName;
    }
    
    public int setId(int newId) {
      id = newId;
    }
    
    public int setStock(int newStock) {
      stock = newStock;
    }
    
    public int addToStock(int addition) {
      stock += addition;
      }
     
