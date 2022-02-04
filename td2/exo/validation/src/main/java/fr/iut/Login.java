package fr.iut;
import jakarta.validation.constraints.*;
import jakarta.validation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.*;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = LoginValidator.class)
public @interface Login {
    String  message() default "{login doit être entre 2 et 8 caractères.}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
