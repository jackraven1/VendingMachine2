package se.lexicon.model;

public interface Product {
    String examine();
    String use();
    String getProductName();
    void setProductName(String productName);
    double getPrice();
    void setPrice(double price);
}
