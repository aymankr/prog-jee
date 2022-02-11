package fr.iut;
<<<<<<< HEAD

import jakarta.validation.*;

public class LoginValidator implements ConstraintValidator<Login, String> {
=======
import jakarta.validation.*;

public class LoginValidator implements ConstraintValidator <Login, String> {
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
    @Override
    public void initialize(Login login) {  }

    @Override
    public boolean isValid(String s,
                           ConstraintValidatorContext constraintValidatorContext) {
<<<<<<< HEAD
        return s.length()>=2 && s.length()<=8 && s.matches("\\w+");
    }

}
=======
        return s.length() >= 2 && s.length() <= 8 && s.matches("\\w+");
    }
}
>>>>>>> 8048cac6d601e091fe80087693605c695b047d9a
