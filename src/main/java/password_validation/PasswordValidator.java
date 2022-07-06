package password_validation;

import java.util.Locale;
import java.util.regex.Pattern;

public class PasswordValidator {

    boolean validate(String password) {
        return isLengthValid(password)
                && containsCapitalLetter(password)
                && containsLowerCase(password)
                && containsNumber(password)
                && containsUnderScore(password);
    }

    private boolean containsNumber(String password) {
        var pattern = Pattern.compile("\\d+");
        return pattern.matcher(password).find();
    }

    private boolean containsUnderScore(String password) {
        var pattern = Pattern.compile("_");
        return pattern.matcher(password).find();
    }

    private boolean containsCapitalLetter(String password) {
        return !password.equals(password.toLowerCase(Locale.ROOT));
    }

    private boolean containsLowerCase(String password) {
        return !password.equals(password.toUpperCase(Locale.ROOT));
    }

    private boolean isLengthValid(String password) {
        return password.length() > 8;
    }

}
