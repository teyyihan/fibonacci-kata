package validator;

import java.util.Locale;

public class CapitalLetterValidator {
    public CapitalLetterValidator() {
    }

    public boolean validate(String password) {
        return !password.equals(password.toLowerCase(Locale.ROOT));
    }
}