package Minhub.APiGestiondeEventos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

    public Customer(Long id, String name, String lastName, String email, Boolean activeted, int edad, CustomerGender gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.activeted = activeted;
        this.edad = edad;
        this.gender = gender;
    }

    public Customer() {
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
