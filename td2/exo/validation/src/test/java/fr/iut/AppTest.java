package fr.iut;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import jakarta.validation.*;;
import org.junit.jupiter.api.*;
import java.util.Set;
=======

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a

import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

<<<<<<< HEAD


    private static Validator validator;
=======
    private  static Validator validator;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    private Set<ConstraintViolation<Person>> violations;

    @BeforeAll
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
<<<<<<< HEAD
    }


    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testPerson() {
=======
    }

    @Test
    public void testNOk() {
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
        Person p2 = new Person();
        p2.setFirstName("21");
        p2.setLastName("a");
        p2.setEmail("21");
        p2.setLogin(null);
        violations = validator.validate(p2);
        assertEquals(4, violations.size());
    }
<<<<<<< HEAD


=======
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
}
