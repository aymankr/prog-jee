package fr.iut;

<<<<<<< HEAD
import jakarta.validation.constraints.Min;
=======

>>>>>>> 009d885bf67acedb2a239c63add3986d5deeac91
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.util.Date;

public class Document {

    @NotNull
    private String title;

    @NotNull
    private String Content;

    @PastOrPresent
    @NotNull
    private Date creationDate;

    @PastOrPresent
    private Date lastModification;


    @NotNull
    private Person creator;
    private Person lastModifier;



    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public Person getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(Person lastModifier) {
        this.lastModifier = lastModifier;
    }
}
