package password_validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {


    private final PasswordValidatorFactory passwordValidatorFactory = new PasswordValidatorFactory();
    private final PasswordValidator passwordValidatorV1 = passwordValidatorFactory.getPasswordValidator(1);
    private final PasswordValidator passwordValidatorV2 = passwordValidatorFactory.getPasswordValidator(2);
    private final PasswordValidator passwordValidatorV3 = passwordValidatorFactory.getPasswordValidator(3);


    @Test
    void itShouldValidateEmptyPassword() {
        // Given
        var password = "";

        // When & Then
        Assertions.assertFalse(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithInvalidLength() {
        // Given
        var password = "1234567";

        // When & Then
        Assertions.assertFalse(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutCapitalLetter() {
        // Given
        var password = "123456789";

        // When & Then
        Assertions.assertFalse(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutLowerCase() {
        // Given
        var password = "123456789A";

        // When & Then
        Assertions.assertFalse(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutNumber() {
        // Given
        var password = "AAAAaaaaa";

        // When & Then
        Assertions.assertFalse(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutUnderScore() {
        // Given
        var password = "123456789Aa";

        // When & Then
        Assertions.assertFalse(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidatePassword() {
        // Given
        var password = "123456789Aa_";

        // When & Then
        Assertions.assertTrue(passwordValidatorV1.validate(password));
    }

    @Test
    void itShouldValidateEmptyPasswordV2() {
        // Given
        var password = "";

        // When & Then
        Assertions.assertFalse(passwordValidatorV2.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithInvalidLengthV2() {
        // Given
        var password = "123456";

        // When & Then
        Assertions.assertFalse(passwordValidatorV2.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutCapitalLetterV2() {
        // Given
        var password = "123456789";

        // When & Then
        Assertions.assertFalse(passwordValidatorV2.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutLowerCaseV2() {
        // Given
        var password = "123456789A";

        // When & Then
        Assertions.assertFalse(passwordValidatorV2.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutNumberV2() {
        // Given
        var password = "AAAAaaaaa";

        // When & Then
        Assertions.assertFalse(passwordValidatorV2.validate(password));
    }

    @Test
    void itShouldValidatePasswordV2() {
        // Given
        var password = "123456789Aa_";

        // When & Then
        Assertions.assertTrue(passwordValidatorV2.validate(password));
    }
//
    @Test
    void itShouldValidateEmptyPasswordV3() {
        // Given
        var password = "";

        // When & Then
        Assertions.assertFalse(passwordValidatorV3.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithInvalidLengthV3() {
        // Given
        var password = "123456";

        // When & Then
        Assertions.assertFalse(passwordValidatorV3.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutCapitalLetterV3() {
        // Given
        var password = "1234567891232342345_";

        // When & Then
        Assertions.assertFalse(passwordValidatorV3.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutLowerCaseV3() {
        // Given
        var password = "123456789ABCADFSDLFS_";

        // When & Then
        Assertions.assertFalse(passwordValidatorV3.validate(password));
    }

    @Test
    void itShouldValidatePasswordWithoutUnderScoreV3() {
        // Given
        var password = "12345678912345asdf23Aa";

        // When & Then
        Assertions.assertFalse(passwordValidatorV3.validate(password));
    }

    @Test
    void itShouldValidatePasswordV3() {
        // Given
        var password = "12345678912345asdf23Aa_";

        // When & Then
        Assertions.assertTrue(passwordValidatorV3.validate(password));
    }

}
