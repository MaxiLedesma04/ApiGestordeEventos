package Minhub.APiGestiondeEventos.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class EventLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    private Date date;
    private int assistants;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    public EventLocation(Long id, Date date, int assistants) {
        this.id = id;
        this.date = date;
        this.assistants = assistants;
    }

    public EventLocation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAssistants() {
        return assistants;
    }

    public void setAssistants(int assistants) {
        this.assistants = assistants;
    }
}
