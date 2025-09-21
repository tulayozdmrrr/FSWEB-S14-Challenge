package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.1, "Double Sandwich");
        this.chips = "Curvy";
        this.drink = "Coke";
    }

  public String getChips(){
        return chips;
  }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }
}
