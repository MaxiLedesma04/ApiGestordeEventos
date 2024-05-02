package Minhub.APiGestiondeEventos.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    private char name;
    private char location;
    private int capacity;
    private char img;
    @OneToMany
    private Set<EventLocation> eventLocations = new HashSet<>();


    public Location(Long id, char name, char location, int capacity, char img) {
        this.id =id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.img = img;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getLocation() {
        return location;
    }

    public void setLocation(char location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public char getImg() {
        return img;
    }

    public void setImg(char img) {
        this.img = img;
    }
}
