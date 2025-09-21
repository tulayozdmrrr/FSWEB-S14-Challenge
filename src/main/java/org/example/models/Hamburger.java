package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName(){
        return name;
    }
    public String getMeat(){
        return meat;
    }
    public double getPrice(){
        return price;
    }
    public String getBreadRollType(){
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);

        if (addition1Name != null) {
            totalPrice += addition1Price;
            System.out.println("Addition1: " + addition1Name);
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
            System.out.println("Addition2: " + addition2Name);
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
            System.out.println("Addition3: " + addition3Name);
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
            System.out.println("Addition4: " + addition4Name);
        }

        System.out.printf("Price: %.2f\n", totalPrice);
        return totalPrice;
    }
}
