package lab09;

import java.util.H*;

public class Product {
    private int id;             //product id
    private String name;        //product name
    private double price;       //product price

    //constructor method
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //get and set methods
    public int getId()          { return id; }
    public String getName()     { return name; }
    public double getPrice()    { return price; }

    @Override
    public String toString() {
        return id + ": " + name + " ($" + price + ")";
    }

    public static void main(String[] args) {
        //TODO: add code below
    }
}
