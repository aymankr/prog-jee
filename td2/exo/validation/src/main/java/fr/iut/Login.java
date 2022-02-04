package fr.iut;

import jakarta.validation.*;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = LoginValidator.class)

public @interface Login {
    String  message() default "{login should be less than 500 alphanumerics chars}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
