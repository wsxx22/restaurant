package com.wsx22.restaurant.hibernate;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "menus")
public class Menu implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private int id;

    @Column (name = "name")
    private String name;

    //private List<Category> categories;

    public Menu() {
    }

    public Menu(String name) {
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
