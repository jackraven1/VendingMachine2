package se.lexicon;

import se.lexicon.model.*;

public class HappyMachine implements VendingMachine {
    private final Product[] products;
    private int depositPool = 0;

    public HappyMachine(){
        products = new Product[6];
        products[0] = new Greenie(1, 2.0, "Green Broccoli", 0.5);
        products[1] = new Greenie(2, 3.0, "Brown Broccoli", 0.2);
        products[2] = new Snus(3, 49.0, "Kronan", "Bitter Orange");
        products[3] = new Snus(4, 60, "General", "Orginal");
        products[4] = new SoftDrink(5, 15.0, "Milk", 100);
        products[5] = new SoftDrink(6, 20, "Pepsi Max", 50);
    }
    @Override
    public void addCurrency(Currency amount) {
        depositPool += amount.getValue();
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product != null && product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= (int) product.getPrice();
                    return product;
                } else {
                    System.out.println("add more money!");
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }



    @Override
    public int endSession() {
        int remainingBalance = depositPool;
        System.out.println("Returning " + remainingBalance + "kr.");
        depositPool = 0;
        return remainingBalance;
    }

    @Override
    public String getDescription(int id) {
        switch(id){
            case 1:
                products[0].examine();
                break;
            case 2:
                products[1].examine();
                break;
            case 3:
                products[2].examine();
                break;
            case 4:
                products[3].examine();
                break;
            case 5:
                products[4].examine();
                break;
            case 6:
                products[5].examine();
                break;
            default:
                System.out.println("Product not found.");
                break;
        }
        return "";
    }

    @Override
    public String[] getProducts() {
        String[] prods = new String[6];
        prods[0] = products[0].examine();
        prods[1] = products[1].examine();
        prods[2] = products[2].examine();
        prods[3] = products[3].examine();
        prods[4] = products[4].examine();
        prods[5] = products[5].examine();
        return prods;
    }
}
