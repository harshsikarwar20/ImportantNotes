import java.util.*;
public class HashCodeAndEqualsInObjectCase {
    public static void main(String[] args) {
        Pen pen1 = new Pen(10, "blue");
        Pen pen2 = new Pen(10, "blue");

        // System.out.println(pen1);
        // System.out.println(pen2);

        // System.out.println(pen1==pen2); // false
        // System.out.println(pen1.equals(pen2)); // false
        System.out.println(pen1.equals(pen2));// Now it will print true after making equals() method...
        Set<Pen> pens = new HashSet<>();
        pens.add(pen1);
        pens.add(pen2);

        System.out.println(pens);
    }
}
// Java docs says that when you are defining equals() method 
// so you have to define hashcode() also with that...
class Pen{
    int price;
    String color;
    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }
    
    public boolean equals(Object obj){
        Pen that = (Pen) obj;
        boolean isEqual = this.price == that.price && 
        this.color.equals(that.color);
        return isEqual;
    }

    public int hashcode(){
        return price + color.hashCode();
    }
}
