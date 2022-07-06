package validator;

import java.util.Locale;

public class LowercaseValidator {
    public LowercaseValidator() {
    }

    public boolean validate(String password) {
        return !password.equals(password.toUpperCase(Locale.ROOT));
    }
}