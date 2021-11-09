import java.util.LinkedList;
import java.util.List;

public class Order {
    private String owner;
    private String recipient;
    private List<Drink> contents;

    public Order(){
        this.owner = "";
        this.recipient = "";
        this.contents = new LinkedList<>();
    }

    public void setOwner(String who) { 
        this.owner = who;
    }

    public void setRecipient(String who) { 
        this.recipient = who;
    }

     public String getOwner() { 
        return this.owner;
    }

    public String getRecipient() { 
        return this.recipient;
    }

    public List<Drink> getDrinks() { return contents; }

    @Override
public String toString() {
    return "Order: " + owner + " / " + recipient + " / { " + contents + "}";
}

    static class Drink {
        public Drink(String name){ this.name = name; }
        private String name;
        public String getName() { return name; }
        @Override public String toString() { return name; }

    }

}