package fr.iut;

<<<<<<< HEAD
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
=======
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
import jakarta.validation.constraints.PastOrPresent;

import java.util.Date;

public class Document {
<<<<<<< HEAD

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
=======
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
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
<<<<<<< HEAD
        return Content;
    }

    public void setContent(String content) {
        Content = content;
=======
        return content;
    }

    public void setContent(String content) {
        this.content = content;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

<<<<<<< HEAD
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
=======
    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }
}

>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
