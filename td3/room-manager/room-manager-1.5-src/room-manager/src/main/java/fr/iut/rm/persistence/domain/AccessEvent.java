package fr.iut.rm.persistence.domain;

import jakarta.validation.constraints.Size;
import jdk.jfr.Name;
import org.checkerframework.checker.units.qual.Length;

import javax.persistence.*;
import java.util.List;

/**
 * A classic room
 */
@Entity
@Table(name = "accessevent")
public class AccessEvent {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private boolean event;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Room getRoom() {
        return room;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEvent() {
        return event;
    }

    public void setEvent(boolean event) {
        this.event = event;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Default constructor (do nothing)
     */
    public AccessEvent() {

    }
}
