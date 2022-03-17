package fr.iut.rm.web.api.model;

/**
 * Defines a room to create for the API layer (Room Visual Object)
 */
public class SaveRoomVO {

    private String name;

    public String getDescription() {
        return description;
    }

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // TODO add necessary fields
}
