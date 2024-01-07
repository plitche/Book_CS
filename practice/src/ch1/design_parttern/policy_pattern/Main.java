package ch1.design_parttern.policy_pattern;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("kundolA", 100);
        Item B = new Item("kundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACard
        cart.pay(new LUNACardStrategy("kundol@example.com", "pukubababo"));

        // pay by KAKAOCard
        cart.pay(new KAKAOCardStrategy("Ju hongchul", "123456789", "123", "12/01"));
    }

}
