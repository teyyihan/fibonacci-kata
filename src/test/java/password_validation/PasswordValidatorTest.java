package password_validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    private final PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void itShouldValidateEmptyPassword() {
        // Given
        var password = "";

        // When & Then
        Assertions.assertFalse(passwordValidator.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithInvalidLength() {
        // Given
        var password = "1234567";

        // When & Then
        Assertions.assertFalse(passwordValidator.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutCapitalLetter() {
        // Given
        var password = "123456789";

        // When & Then
        Assertions.assertFalse(passwordValidator.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutLowerCase() {
        // Given
        var password = "123456789A";

        // When & Then
        Assertions.assertFalse(passwordValidator.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutNumber() {
        // Given
        var password = "AAAAaaaaa";

        // When & Then
        Assertions.assertFalse(passwordValidator.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutUnderScore() {
        // Given
        var password = "123456789Aa";

        // When & Then
        Assertions.assertFalse(passwordValidator.validate(password));
    }

    @Test
    void itShouldValidatePassword() {
        // Given
        var password = "123456789Aa_";

        // When & Then
        Assertions.assertTrue(passwordValidator.validate(password));
    }

}
