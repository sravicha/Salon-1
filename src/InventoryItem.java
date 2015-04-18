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
    
    public void setName(String newName) {
      name = newName;
    }
    
    public void setId(int newId) {
      id = newId;
    }
    
    public void setStock(int newStock) {
      stock = newStock;
    }
    
    public void addToStock(int addition) {
      stock += addition;
      }
}
     
