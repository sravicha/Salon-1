/**
 * @author Matthew Meyer
 */
public class Inventory {

    private int id;
    private InventoryItem product;
    
    Inventory() {}
    Inventory(int _id InventoryItem _product) {
        id = _id;
        product = _product;
    }
    
    public int getId() {
        return id;
    }
    
    public String getProductName() {
        return product.getName();
    }
    
    public int getProductId() {
        return product.getId();
    }
    
    public int getProductStock() {
        return product.getStock();
    }
    
    public int getProductPrice(){
        return product.getPrice();
    }
    
    public String getProductCategory(){
        return product.getCategory();
    }
    
    public String getProductSupplier(String name) {
        return product.getSupplier();
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setProductName(String newName) {
        product.setName(newName);
    }
    
    public void setProductId(int newId) {
        product.setId(newId);
    }
    
    public void setProductStock(int newStock) {
        product.setStock(newStock);
    }
    
    public void setProductPrice(int newPrice){
        product.setPrice(newPrice);
    }
    
    public void setProductCategory(String newCategory){
        product.setCategory(newCategory);
    }
    
    public void setProductSupplier(String newSupplier) {
        product.setSupplier(newSupplier);
    }
    

    @Override
    public String toString() {
        return Integer.toString(id) + ",'" +
                product.getName() + "', " + product.getStock();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Inventory && toString().equals(obj.toString()));
    }

}
