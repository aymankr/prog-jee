package fr.iut;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
<<<<<<< HEAD
import jdk.jfr.Name;

public class Person {
    @NotNull
=======

public class Person {
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    @Email
    private String email;
    @NotNull
    private String firstName;
<<<<<<< HEAD

    @NotNull
    private String lastName;

    @Login
    @NotNull
    private String Login;

    @NotNull
    private boolean isStudent;


=======
    @NotNull
    private String lastName;
    @Login
    @NotNull
    private String login;
    @NotNull
    private boolean isStudent;

>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    public String getEmail() {
        return email;
    }

<<<<<<< HEAD
    public void setEmail(String email) {
        this.email = email;
    }

=======
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    public String getFirstName() {
        return firstName;
    }

<<<<<<< HEAD
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

=======
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    public String getLastName() {
        return lastName;
    }

<<<<<<< HEAD
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
=======
    public String getLogin() {
        return login;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
