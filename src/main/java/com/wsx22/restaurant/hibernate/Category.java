package com.wsx22.restaurant.hibernate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "categories")

public class Category implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_category")
    private int id;

    @Column (name = "name")
    private String name;

    //private List<Menu> menus;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
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
}
