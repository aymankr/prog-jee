package fr.iut;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.PastOrPresent;

import java.util.Date;

public class Document {
    @NotNull
    private String title;

    @Null
    private String content;
    @Null
    @PastOrPresent
    private Date creationDate;
    @PastOrPresent
    private Date lastModification;
    private Person lastModifier;
    @NotNull
    private Person creator;

    public Person getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(Person lastModifier) {
        this.lastModifier = lastModifier;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }
}

