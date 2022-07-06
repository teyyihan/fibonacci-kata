package validator;

public class LengthValidator {
    private int length = 8;

    public LengthValidator() {
    }

    public LengthValidator(int length) {
        this.length = length;
    }

    public boolean validate(String password) {
        return password.length() > length;
    }
}