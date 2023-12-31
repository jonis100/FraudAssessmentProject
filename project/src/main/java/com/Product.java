package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String productId;
    private String category;
    private double price;
    private double averageRating;
    private int stockQuantity;
    private String recommendation;
    private boolean silentMode;


    // Constructor
    public Product(String productId, String category, double price, 
                   double averageRating, int stockQuantity, boolean silentMode) {
        this.productId = productId;
        this.category = category;
        this.price = price;
        this.averageRating = averageRating;
        this.stockQuantity = stockQuantity;
        this.recommendation = "";
        this.silentMode = silentMode;
    }

    // Getters and Setters
    public String getProductId() { return productId; }
    public void setProductId(String id) { this.productId = id; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getAverageRating() { return averageRating; }
    public void setAverageRating(double rating) { this.averageRating = rating; }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stock) { this.stockQuantity = stock; }

    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
    
    public boolean isSilentMode() { return silentMode; }
    public void setSilentMode(boolean silentMode) { this.silentMode = silentMode; }
}