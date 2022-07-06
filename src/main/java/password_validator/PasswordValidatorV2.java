package password_validator;

import validator.*;

public class PasswordValidatorV2 implements PasswordValidator {
    private final LengthValidator lengthValidator = new LengthValidator(6);
    private final CapitalLetterValidator capitalLetterValidator = new CapitalLetterValidator();
    private final LowercaseValidator lowercaseValidator = new LowercaseValidator();
    private final ContainsNumberValidator containsNumberValidator = new ContainsNumberValidator();

    public boolean validate(String password) {
        return lengthValidator.validate(password)
                && capitalLetterValidator.validate(password)
                && lowercaseValidator.validate(password)
                && containsNumberValidator.validate(password);
    }
}
