package password_validator;

import validator.*;

public class PasswordValidatorV3 implements PasswordValidator{
    private final LengthValidator lengthValidator = new LengthValidator(16);
    private final CapitalLetterValidator capitalLetterValidator = new CapitalLetterValidator();
    private final LowercaseValidator lowercaseValidator = new LowercaseValidator();
    private final UnderscoreValidator underscoreValidator = new UnderscoreValidator();

    public boolean validate(String password) {
        return lengthValidator.validate(password)
                && capitalLetterValidator.validate(password)
                && lowercaseValidator.validate(password)
                && underscoreValidator.validate(password);
    }
}
