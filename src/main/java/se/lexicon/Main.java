package se.lexicon;

import se.lexicon.model.Currency;

public class Main {
    public static void main(String[] args) {
        HappyMachine machine = new HappyMachine();
        machine.addCurrency(Currency.FIVE);
        System.out.println(machine.getBalance());
        machine.request(1);
        System.out.println("--------------");
        System.out.println(machine.getBalance());
        machine.endSession();
        System.out.println(machine.getBalance());
        String[] items = machine.getProducts();
        for(String element : items){
            System.out.println(element);
        }

    }
}