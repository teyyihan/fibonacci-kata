package password_validator;

import validator.*;

public class PasswordValidatorV1 implements PasswordValidator {
    private final LengthValidator lengthValidator = new LengthValidator();
    private final CapitalLetterValidator capitalLetterValidator = new CapitalLetterValidator();
    private final LowercaseValidator lowercaseValidator = new LowercaseValidator();
    private final ContainsNumberValidator containsNumberValidator = new ContainsNumberValidator();
    private final UnderscoreValidator underscoreValidator = new UnderscoreValidator();


    public boolean validate(String password) {
        return lengthValidator.validate(password)
                && capitalLetterValidator.validate(password)
                && lowercaseValidator.validate(password)
                && containsNumberValidator.validate(password)
                && underscoreValidator.validate(password);
    }
}
