package se.lexicon;

import se.lexicon.model.Currency;
import se.lexicon.model.Product;

public interface VendingMachine {
    void addCurrency(Currency amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
