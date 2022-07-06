package password_validator;

public class PasswordValidatorFactory {

    public PasswordValidator getPasswordValidator(int version) {
        if (version == 1) {
            return new PasswordValidatorV1();
        }
        if (version == 2) {
            return new PasswordValidatorV2();
        }
        if (version == 3) {
            return new PasswordValidatorV3();
        }

        return null;
    }

}
