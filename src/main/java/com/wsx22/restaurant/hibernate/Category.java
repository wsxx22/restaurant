package com.wsx22.restaurant.hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "categories")

public class Category implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_category")
    private int id;

    @Column (name = "name")
    private String name;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinTable (name = "menu_categories", joinColumns = {@JoinColumn (name = "id_category")},
                inverseJoinColumns = {@JoinColumn (name = "id_menu") })
    private List<Menu> menu;

    public Category() {
    }

    public Category(String name, List<Menu> menu) {
        this.name = name;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }
}
