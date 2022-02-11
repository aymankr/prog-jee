package fr.iut;
import jakarta.validation.*;

public class LoginValidator implements ConstraintValidator<Login, String> {

    @Override
    public void initialize(Login login) {  }

    @Override
    public boolean isValid(String s,
                           ConstraintValidatorContext constraintValidatorContext) {
        return s.length() >= 2 && s.length() <= 8 && s.matches("\\w+");
    }

}
