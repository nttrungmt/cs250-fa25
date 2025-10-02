package lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item {
    private int ID;              //Item's ID
    private String name;         //Item's Name
    private double price;        //Item's price
    private String warehouse;    //Item's warehouse - Winona or Rochester
    
    //constructor method
    public Item(int iD, String name, double price, String warehouse) {
        super();
        ID = iD;
        this.name = name;
        this.price = price;
        this.warehouse = warehouse;
    }
    
    //get and set methods
    public int getID()                          { return ID;        }
    public String getName()                     { return name;        }
    public void setName(String name)            { this.name = name;    }
    public double getPrice()                    { return price;        }
    public void setPrice(double price)          { this.price = price; }
    public String getWarehouse()                { return warehouse;    }
    public void setWarehouse(String warehouse)  { this.warehouse = warehouse; }

    @Override
    public String toString() {
        return + ID + ", " + name + ", " + price + ", " + warehouse;
    }
    
    //return a sample data in 2D String array
    public static List<Item> getSampleData() {
        return new ArrayList<Item>(Arrays.asList(
            new Item(101, "HP 14-inch x360 FHD Touch Chromebook Laptop", 184, "Winona"),
            new Item(102, "Apple Watch SE (2nd Gen) [GPS 40mm] Smartwatch", 189, "Rochester"),
            new Item(201, "Straight Talk Motorola Razr 2024, 5G, 256GB", 199.5, "Rochester"),
            new Item(405, "Portable Monitor Zero Frame, 15.6\" Ultra Slim", 69.39, "Winona")
        ));
    }
}
