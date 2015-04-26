/** a
* @author Graison Day
*/
// A class meant for items that are supposed to go into inventories

public class Inventory {
    
    private String name;
    private int id;
    private int stock;
    private int price;
    private String category;
    private String supplier;
    
    public Inventory() {}
    public Inventory(String aName, int aId, int aStock, int aPrice, String aCategory, String aSupplier){
      name = aName;
      id = aId;
      stock = aStock;
      price = aPrice;
      category = aCategory;
      supplier = aSupplier;
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

    public int getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getSupplier() {
        return supplier;
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
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    public void setCategory(String newCategory) {
        category = newCategory;
    }
    public void setSupplier(String newSupplier) {
        supplier = newSupplier;
    }

    @Override
    public String toString() {
        return  "Product #:\t" + Integer.toString(id) +
                "Name:\t" + name +
                "Price:\t$" + Integer.toString(price/100) + "." + Integer.toString(price%100) +
                "Stock:\t" + Integer.toString(stock) +
                "Category:\t" + category +
                "Supplier:\t" + supplier;
    }

    public String toDBString() {
        return Integer.toString(id) + ", '" +
                name + "', " +
                Integer.toString(price) + ", " +
                Integer.toString(stock) + ", '" +
                category + "', '" +
                supplier + "'";
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Inventory && toString().equals(obj.toString()));
    }
}

