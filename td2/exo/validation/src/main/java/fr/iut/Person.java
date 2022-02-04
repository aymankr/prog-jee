package fr.iut;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Name;

public class Person {
    @NotNull
    @Email
    private String email;
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Login
    @NotNull
    private String Login;

    @NotNull
    private boolean isStudent;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
