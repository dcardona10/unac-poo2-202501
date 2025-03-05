package registry.exception;

public class EmailValidationException extends Exception {

    public EmailValidationException() {
        super("Email not in valid format");
    }
}
