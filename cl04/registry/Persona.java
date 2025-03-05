package registry;

import registry.exception.EmailValidationException;
import registry.exception.PhoneValidationException;

public class Persona {

    private String id;
    private String name;
    private String phone;
    private String email;

    private static final String EMAIL_REGEX = "[a-zA-Z]+[(a-zA-Z0-9-\\\\_\\\\.!\\\\D)]*[(a-zA-Z0-9)]+@[(a-zA-Z)]+\\.[(a-zA-Z)]{2,3}";
    private static final String PHONE_REGEX = "(?:\\d{3}-){2}\\d{4}";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws PhoneValidationException {
        if (phone.matches(PHONE_REGEX)) {
            this.phone = phone;
        } else {
            throw new PhoneValidationException();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailValidationException {
        if (email.matches(EMAIL_REGEX)) {
            this.email = email;
        } else {
            throw new EmailValidationException();
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
