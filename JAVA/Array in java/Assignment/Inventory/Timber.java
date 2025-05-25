package java.Assignment.Inventory;
import java.util.*;
public class Timber {
     char zone;
     int timberID;
     String kind;
     float weight;
     float height;
     int quantity;
     int price;

    public Timber(char zone, int timberID, String kind, float weight, float height, int quantity, int price) {
        this.zone = zone;
        this.timberID = timberID;
        this.kind = kind;
        this.weight = weight;
        this.height = height;
        this.quantity = quantity;
        this.price = price;
    }

    public char getZone() {
        return zone;
    }

    public int getTimberID() {
        return timberID;
    }

    public String getKind() {
        return kind;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Timber{" +
                "zone=" + zone +
                ", timberID=" + timberID +
                ", kind='" + kind + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}