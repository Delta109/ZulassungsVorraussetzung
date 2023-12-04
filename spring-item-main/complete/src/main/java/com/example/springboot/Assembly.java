package com.example.springboot;
import java.util.List;
import inginf.Item;

public class Assembly {

private int id;
private String name;

// Andere Attribute...

private List<Item> assignedItems;

// Konstruktor, Getter und Setter für andere Attribute...

public List<Item> getAssignedItems() {
    return assignedItems;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public void setId(int id) {
    this.id = id;
}



}
