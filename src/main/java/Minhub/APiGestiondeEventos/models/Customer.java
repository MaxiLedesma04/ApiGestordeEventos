package Minhub.APiGestiondeEventos.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    private String name;
    private String lastName;

    private String email;
    private Boolean activeted;
    private int edad;
    private CustomerGender gender;
    @OneToMany
    private Set<Comment> comments = new HashSet<>();
    @OneToMany
    private Set<Event> events = new HashSet<>();

    public Customer( String name, String lastName, String email, Boolean activeted, int edad, CustomerGender gender) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.activeted = activeted;
        this.edad = edad;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActiveted() {
        return activeted;
    }

    public void setActiveted(Boolean activeted) {
        this.activeted = activeted;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public CustomerGender getGender() {
        return gender;
    }

    public void setGender(CustomerGender gender) {
        this.gender = gender;
    }
}
