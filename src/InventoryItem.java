/** a
* @author Graison Day
*/
// A class meant for items that are supposed to go into inventories

public class InventoryItem {
    
    private String name;
    private int id;
    private int stock;
    private int price;
    private String category;
    private String supplier;
    
    InventoryItem() {}
    InventoryItem(String aName, int aId, int aStock, int aPrice, String aCategory, String aSupplier){
      name = aName;
      id = aId;
      stock = aStock;
<<<<<<< HEAD
=======
      price = aPrice;
      category = aCategory;
      supplier = aSupplier;
>>>>>>> 8629d9e653c7262486fdef8b496a9edb493a535d
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
    
<<<<<<< HEAD
=======
    public int getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getSupplier() {
        return supplier;
    }
    
>>>>>>> 8629d9e653c7262486fdef8b496a9edb493a535d
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
<<<<<<< HEAD
      }
}
=======
    }
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    public void setCategory(String newCategory) {
        category = newCategory;
    }
    public void setSupplier(String newSupplier) {
        supplier = newSupplier;
    }
}

>>>>>>> 8629d9e653c7262486fdef8b496a9edb493a535d
     
