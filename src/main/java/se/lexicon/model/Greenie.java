package se.lexicon.model;

public class Greenie implements Product {
    private int id;
    private double price;
    private String productName;
    private double wight;

    public Greenie(int id, double price, String productName, double wight){
        setId(id);
        setPrice(price);
        setProductName(productName);
        setWight(wight);
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", name:" + getProductName() + ", price:" + getPrice() + ", weight:" + getWight();
    }

    @Override
    public String use() {
        return "Enjoy your " + getWight() + " gram Broccoli!";
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

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
}
