package com.wsx22.restaurant.hibernate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "menu_items")

public class MenuItem implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_menu_item")
    private int id;

    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "id_category", referencedColumnName = "id_category")
    private Category category;

    @Column (name = "name")
    private String name;

    @Column (name = "description")
    private String description;

    @Column (name = "amount")
    private String amount;

    @Column (name = "price")
    private double price;

    public MenuItem() {
    }

    public MenuItem(Category category, String name, String description, String amount, double price) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
