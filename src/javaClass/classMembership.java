package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class classMembership {
    private int membership;
    private String name;
    private String description;
    private int condition;
    private int numberEvents;
    private int numberAdmins;
    private int numberModerators;
    private int numberGuests;
    private float price;

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getNumberEvents() {
        return numberEvents;
    }

    public void setNumberEvents(int numberEvents) {
        this.numberEvents = numberEvents;
    }

    public int getNumberAdmins() {
        return numberAdmins;
    }

    public void setNumberAdmins(int numberAdmins) {
        this.numberAdmins = numberAdmins;
    }

    public int getNumberModerators() {
        return numberModerators;
    }

    public void setNumberModerators(int numberModerators) {
        this.numberModerators = numberModerators;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   
        
        
    
    
}
