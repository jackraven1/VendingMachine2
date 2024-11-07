package se.lexicon.model;

public class SoftDrink implements Product {
    private int id;
    private double price;
    private String productName;
    private double size;

    public SoftDrink(int id, double price, String productName, double size){
        setId(id);
        setPrice(price);
        setProductName(productName);
        setSize(size);
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", name: " + getProductName() + ", price:" + getPrice() + ", size: " + getSize();
    }

    @Override
    public String use() {
        return "Enjoy your drink!";
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
