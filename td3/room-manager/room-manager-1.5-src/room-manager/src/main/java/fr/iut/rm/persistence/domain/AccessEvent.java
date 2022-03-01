package fr.iut.rm.persistence.domain;

import jakarta.validation.constraints.Size;

import javax.persistence.*;
import java.util.Date;

/**
 * A classic Event
 */
@Entity
@Table(name = "accessEvent")
public class AccessEvent {
    /**
     * sequence generated id
     */
    @Id
    @GeneratedValue
    private long id;

    /**
     * Event's Room
     */
    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    /**
     * Event desciption true for entrance, false for exit
     */
    private boolean event;

    /**
     * Date the event
     */
    private Date date;

    /**
     * Name of the persone creating the event
     */
    private String personName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isEvent() {
        return event;
    }

    public void setEvent(boolean event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
