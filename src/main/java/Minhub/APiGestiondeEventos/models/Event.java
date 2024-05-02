package Minhub.APiGestiondeEventos.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    private char desc;
    private char img;
    private short age_req;
    private char name;

    public Event(Long id, char desc, char img, short age_req, char name) {
        this.id = id;
        this.desc = desc;
        this.img = img;
        this.age_req = age_req;
        this.name = name;
    }

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getDesc() {
        return desc;
    }

    public void setDesc(char desc) {
        this.desc = desc;
    }

    public char getImg() {
        return img;
    }

    public void setImg(char img) {
        this.img = img;
    }

    public short getAge_req() {
        return age_req;
    }

    public void setAge_req(short age_req) {
        this.age_req = age_req;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
