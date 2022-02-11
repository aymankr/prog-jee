package fr.iut;
<<<<<<< HEAD

import jakarta.validation.*;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

=======
import jakarta.validation.constraints.*;
import jakarta.validation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.*;
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = LoginValidator.class)
<<<<<<< HEAD

public @interface Login {
    String  message() default "{login should be less than 500 alphanumerics chars}";
=======
public @interface Login {
    String  message() default "{login doit être entre 2 et 8 caractères.}";
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
