package se.lexicon.model;

public class Snus implements Product {
    private int id;
    private double price;
    private String productName;
    private String flavor;

    public Snus(int id, double price, String productName, String flavor){
        this.id = id;
        this.price = price;
        this.productName = productName;
        this.flavor = flavor;
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", name: " + getProductName() + ", price: " + getPrice() + ", flavor: " + getFlavor();
    }

    @Override
    public String use() {
        return "Enjoy your " + getFlavor() + " snus!";
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

    public String getFlavor() {
        return flavor;
    }
}
