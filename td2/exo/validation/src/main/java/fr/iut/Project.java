package fr.iut;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

import java.util.List;

public class Project {
<<<<<<< HEAD

    @NotNull
    private String description;

    @NotNull
    private String name;

    @NotNull
    @URL
    private String urlRepository;

    private List<Person> teachers;
    private List<Person> students;
    private List<Person> customers;

    private List<Document> mesDocuments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlRepository() {
        return urlRepository;
    }

    public void setUrlRepository(String urlRepository) {
        this.urlRepository = urlRepository;
    }
=======
    @NotNull
    private String description;
    @NotNull
    private String name;
    @NotNull
    @URL
    private String urlRepository;
    private List<Person> teachers;
    private List<Person> students;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a

    public List<Person> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Person> teachers) {
        this.teachers = teachers;
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    public List<Person> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Person> customers) {
        this.customers = customers;
    }

    public List<Document> getMesDocuments() {
        return mesDocuments;
    }

    public void setMesDocuments(List<Document> mesDocuments) {
        this.mesDocuments = mesDocuments;
    }jakarta.validation</

<<<<<<< HEAD
=======
    private List<Person> customers;
    private List<Document> mesDocuments;

>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
<<<<<<< HEAD
=======

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlRepository() {
        return urlRepository;
    }

    public void setUrlRepository(String urlRepository) {
        this.urlRepository = urlRepository;
    }
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
}
