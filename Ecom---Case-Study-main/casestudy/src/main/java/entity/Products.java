package entity;

public class Products {
    private int product_id;
    private String name;
    private double price;
    private String description;
    private int stockQuantity;

    public Products(){}
    
    public Products(int product_id, String name, double price, String description, int stockQuantity) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters
    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString(){
        return "\n"+"Product ID: "+this.getProduct_id() +"\n"+"Name: "+this.getName()+"\n" + "Price: " + this
        .getPrice()+"\n" + "Description: " + this.getDescription()+"\n" + "Stock Quantity: " + this.getStockQuantity()+"\n";
    }
}