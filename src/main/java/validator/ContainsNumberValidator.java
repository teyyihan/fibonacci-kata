package validator;

import java.util.regex.Pattern;

public class ContainsNumberValidator {
    public ContainsNumberValidator() {
    }

    public boolean validate(String password) {
        var pattern = Pattern.compile("\\d+");
        return pattern.matcher(password).find();
    }
}