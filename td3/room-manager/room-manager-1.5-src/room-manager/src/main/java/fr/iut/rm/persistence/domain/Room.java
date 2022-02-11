package fr.iut.rm.persistence.domain;

import jakarta.validation.constraints.Size;
import jdk.jfr.Description;
import org.checkerframework.checker.units.qual.Length;

import javax.persistence.*;

/**
 * A classic room
 */
@Entity
@Table(name = "room")
public class Room {
    /**
     * sequence generated id
     */
    @Id
    @GeneratedValue
    private long id;

    @Size(max=10)
    @Column(length=10)
    private String description;

    /**
     * Room's name
     */
    @Column(nullable = false, unique = true)
    private String name;

    /**
     * Default constructor (do nothing)
     */
    public Room() {
        // do nothing
    }

    /**
     * anemic getter
     *
     * @return the room's id
     */
    public long getId() {
        return id;
    }

    /**
     * anemic setter
     *
     * @param id the new id
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     * anemic getter
     *
     * @return the calling number
     */
    public String getName() {
        return name;
    }

    /**
     * anemic setter
     *
     * @param name the new calling number to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
