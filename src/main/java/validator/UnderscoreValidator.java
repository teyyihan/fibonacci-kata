package validator;

import java.util.regex.Pattern;

public class UnderscoreValidator {
    public UnderscoreValidator() {
    }

    public boolean validate(String password) {
        var pattern = Pattern.compile("_");
        return pattern.matcher(password).find();
    }
}