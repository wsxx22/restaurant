package com.wsx22.restaurant.hibernate;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "menus")
public class Menu implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private int id;

    @Column (name = "name")
    private String name;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinTable (name = "menu_categories",joinColumns = {@JoinColumn (name = "id_menu")},
                inverseJoinColumns = {@JoinColumn (name = "id_category")})
    private List<Category> categories;

    public Menu() {
    }

    public Menu(String name, List<Category> categories) {
        this.name = name;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
