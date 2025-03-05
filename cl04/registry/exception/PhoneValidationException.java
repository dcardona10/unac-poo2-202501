package registry.exception;

public class PhoneValidationException extends Exception {

    public PhoneValidationException() {
        super("Phone not in a valid format");
    }
}
