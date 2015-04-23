/** a
* @author Graison Day
*/
// A class meant for items that are supposed to go into inventories

public class InventoryItem {
    
    private String name;
    private int id;
    private int stock;
    private String supplier;
    
    InventoryItem() {}
    InventoryItem(String aName, int aId, int aStock, String aSupplier){
      name = aName;
      id = aId;
      stock = aStock;
      supplier = aSupplier;
    }
      
    public String getName() {
      return name;
    }
    
    public String getSupplier() {
        return supplier;
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
    
    public void setSupplier(String newSupplier) {
        supplier = newSupplier;
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

     
